package com.example.producingwebservice.endpoint;

import com.mdsap.pttwl.domain.Wlmwldata;
import com.mdsap.pttwl.domain.model.WLmwldataMatchResult;
import com.mdsap.pttwl.domain.model.WlmwldataService;
import com.mdsap.pttwl.repository.WlmwldataRepository;
import io.spring.guides.gs_producing_web_service.GetPersonRequest;
import io.spring.guides.gs_producing_web_service.GetPersonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.datatype.DatatypeConfigurationException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Endpoint
public class PersonEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";


	@Autowired
	private  WlmwldataRepository wlmwldataRepository;


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPersonRequest")
	@ResponsePayload
	public GetPersonResponse getPerson(@RequestPayload GetPersonRequest request) throws DatatypeConfigurationException {

		LocalDate localDate = LocalDate.of(
				request.getBirthdate().getYear(),
				request.getBirthdate().getMonth(),
				request.getBirthdate().getDay());



		WlmwldataService wlmwldatafind = new WlmwldataService(request.getNamedata(),request.getCountrydata(), request.getTinnumberdata(),
				localDate);

		wlmwldatafind.update();

		List<Wlmwldata> result = null;

		if (wlmwldatafind.getNamedata() != null && wlmwldatafind.getTinnumberdata() != null
				&& wlmwldatafind.getCountrydata() != null && wlmwldatafind.getBirthdate() !=null)
			result = wlmwldataRepository.findOneByNamedataAndTinnumberdataAndCountrydataAndBirthdatedata(wlmwldatafind.getNamedata(),
					wlmwldatafind.getTinnumberdata(), wlmwldatafind.getCountrydata(),localDate);
		else if (wlmwldatafind.getNamedata() != null && wlmwldatafind.getTinnumberdata() != null
				&& wlmwldatafind.getCountrydata() != null)
			result = wlmwldataRepository.findOneByNamedataAndTinnumberdataAndCountrydata(wlmwldatafind.getNamedata(),
					wlmwldatafind.getTinnumberdata(), wlmwldatafind.getCountrydata());

		else if (wlmwldatafind.getNamedata() != null && wlmwldatafind.getTinnumberdata() != null)
			result = wlmwldataRepository.findOneByNamedataAndTinnumberdata(wlmwldatafind.getNamedata(),
					wlmwldatafind.getTinnumberdata());

		else if (wlmwldatafind.getNamedata() != null && wlmwldatafind.getCountrydata() != null)
			result = wlmwldataRepository.findOneByNamedataAndCountrydata(wlmwldatafind.getNamedata(),
					wlmwldatafind.getCountrydata());

		else if (wlmwldatafind.getTinnumberdata() != null && wlmwldatafind.getCountrydata() != null)
			result = wlmwldataRepository.findOneByTinnumberdataAndCountrydata(wlmwldatafind.getTinnumberdata(),
					wlmwldatafind.getCountrydata());

		else if (wlmwldatafind.getTinnumberdata() != null)
			result = wlmwldataRepository.findOneByTinnumberdata(wlmwldatafind.getTinnumberdata());

		else if (wlmwldatafind.getNamedata() != null)
			result = wlmwldataRepository.findOneByNamedata(wlmwldatafind.getNamedata());

		WLmwldataMatchResult matchResult = new WLmwldataMatchResult();
		matchResult.addMatchData(result);

		GetPersonResponse res = new GetPersonResponse();
	    res.setPerson(matchResult.getResponse());

		return res;


	}

}
