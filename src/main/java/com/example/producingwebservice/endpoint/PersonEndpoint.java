package com.example.producingwebservice.endpoint;

import com.mdsap.pttwl.domain.Wlmwldata;
import com.mdsap.pttwl.domain.model.WLmwldataMatchResult;
import com.mdsap.pttwl.domain.model.WlmwldataService;
import com.mdsap.pttwl.repository.SoapResultArchiveRepository;
import com.mdsap.pttwl.repository.WlmwldataRepository;
import io.spring.guides.gs_producing_web_service.GetPersonRequest;
import io.spring.guides.gs_producing_web_service.GetPersonResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.datatype.DatatypeConfigurationException;
import java.time.LocalDate;
import java.util.List;

@Endpoint
public class PersonEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private static Logger log  = Logger.getLogger(PersonEndpoint.class);

	@Autowired
	private  WlmwldataRepository wlmwldataRepository;
	@Autowired
	private SoapResultArchiveRepository soapRepository;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPersonRequest")
	@ResponsePayload
	public GetPersonResponse getPerson(@RequestPayload GetPersonRequest request) throws DatatypeConfigurationException {


		WlmwldataService wlmwldatafind = new WlmwldataService(request.getNamedata(),request.getCountrydata(), request.getTinnumberdata());

		wlmwldatafind.update();

		List<Wlmwldata> result = null;

		 if (wlmwldatafind.getTinnumberdata() != null)
			result = wlmwldataRepository.findOneByTinnumberdata(wlmwldatafind.getTinnumberdata());


		 else if (wlmwldatafind.getNamedata() != null && wlmwldatafind.getCountrydata() != null && request.getBirthdate() !=null) {

			 LocalDate localDate = null;
			 try {
			 	 localDate = LocalDate.of(request.getBirthdate().getYear(), request.getBirthdate().getMonth(), request.getBirthdate().getDay());
				 result = wlmwldataRepository.findOneByNamedataAndCountrydataAndBirthdatedata(wlmwldatafind.getNamedata(),
						 wlmwldatafind.getCountrydata(), localDate);
			 } catch (Exception e)
			 {

				 log.error("Error "+"\n"+e.toString());
			 }

		 }

		else if (wlmwldatafind.getNamedata() != null && wlmwldatafind.getCountrydata() != null)
			result = wlmwldataRepository.findOneByNamedataAndCountrydata(wlmwldatafind.getNamedata(),wlmwldatafind.getCountrydata());


		WLmwldataMatchResult matchResult = new WLmwldataMatchResult();
		matchResult.addMatchData(result, request);

		GetPersonResponse res = new GetPersonResponse();
	    res.setPerson(matchResult.getResponse());

	    try {
	    	if(matchResult.isMatchStatus())
			soapRepository.saveAll(matchResult.getSoapResultsArchive());
		} catch (Exception e)
		{
			res.getPerson().setMatchMessage(res.getPerson().getMatchMessage() +"\n"+e.toString());
			log.error("Error when insert data to SoapResultsArchive table !!!"+"\n"+e.toString());
		}
		return res;


	}

}
