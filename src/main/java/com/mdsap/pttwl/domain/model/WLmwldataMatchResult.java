package com.mdsap.pttwl.domain.model;


import com.mdsap.pttwl.domain.SoapResultsArchive;
import com.mdsap.pttwl.domain.Wlmwldata;
import io.spring.guides.gs_producing_web_service.GetPersonRequest;
import io.spring.guides.gs_producing_web_service.WLmwldataMatchResultXML;
import io.spring.guides.gs_producing_web_service.WlmwldataFindXML;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WLmwldataMatchResult {

    private int matchScore;
    private boolean matchStatus;
    private String matchMessage;
    private List<WlmwldataFind> matchResult;

    private  List<SoapResultsArchive> soapResultsArchive;

    public List<SoapResultsArchive> getSoapResultsArchive() {
        return soapResultsArchive;
    }

    public void setSoapResultsArchive(List<SoapResultsArchive> soapResultsArchive) {
        this.soapResultsArchive = soapResultsArchive;
    }

    public WLmwldataMatchResult() {

        matchScore = 0;
        matchStatus = false;
        matchMessage = "No match result found";
        matchResult = null;

    }

    public int getMatchScore() {
        return matchScore;
    }

    public boolean isMatchStatus() {
        return matchStatus;
    }

    public String getMatchMessage() {
        return matchMessage;
    }

    public List<WlmwldataFind> getMatchResult() {
        return matchResult;
    }

    public void setMatchScore(int matchScore) {
        this.matchScore = matchScore;
    }

    public void setMatchStatus(boolean matchStatus) {
        this.matchStatus = matchStatus;
    }

    public void setMatchMessage(String matchMessage) {
        this.matchMessage = matchMessage;
    }

    public void setMatchResult(List<WlmwldataFind> matchResult) {
        this.matchResult = matchResult;
    }

    public void addMatchData(List<Wlmwldata> wlmwldataList, GetPersonRequest request) {

        if (wlmwldataList == null || wlmwldataList.size() <= 0)
            return;

        this.setMatchScore(100);
        this.setMatchStatus(true);
        this.setMatchMessage("Number of match result is : " + wlmwldataList.size());

        soapResultsArchive = new ArrayList<SoapResultsArchive>();
        matchResult = new ArrayList<WlmwldataFind>();
        for (Wlmwldata data : wlmwldataList) {

            WlmwldataFind val = new WlmwldataFind();
            SoapResultsArchive soapVal = new SoapResultsArchive();

            soapVal.setMatchtxnid(data.getWfprocid());
            soapVal.setMatchScore(this.getMatchScore());
            soapVal.setSearchTinnumberdata(request.getTinnumberdata());
            soapVal.setSearchNamedata(request.getNamedata());
            soapVal.setSearchCountrydata(request.getCountrydata());

            try {
                LocalDate localDate = LocalDate.of(request.getBirthdate().getYear(), request.getBirthdate().getMonth(), request.getBirthdate().getDay());
                soapVal.setSearchBirthdate(localDate);
            } catch (Exception e)
            {
                soapVal.setSearchBirthdate(null);
            }
            soapVal.setSorguId(request.getSorguId());
            soapVal.setMerkezNo(request.getMerkezNo());
            soapVal.setSubeNo(request.getSubeNo());
            soapVal.setGiseNo(request.getGiseNo());
            soapVal.setSicilNo(request.getSicilNo());
            soapVal.setIslemKanali(request.getIslemKanali());
            soapVal.setIslemAdi(request.getIslemAdi());
            soapResultsArchive.add(soapVal);

            val.setNamedata(data.getNamedata());
            val.setTinnumberdata(data.getTinnumberdata());
            val.setCountrydata(data.getCountrydata());
            val.setBltype(data.getWltype().getName());
            val.setBlcode(data.getWltype().getCode());
            val.setBirthdate(data.getBirthdatedata());
            matchResult.add(val);


        }



    }


    public WLmwldataMatchResultXML getResponse() throws DatatypeConfigurationException {
        WLmwldataMatchResultXML res = new WLmwldataMatchResultXML();

        res.setMatchMessage(this.matchMessage);
        res.setMatchStatus(this.matchStatus);
        res.setMatchScore(this.matchScore);

        if(matchResult == null){
            WlmwldataFindXML newResult = new WlmwldataFindXML();
            newResult.setBlcode("");
            newResult.setBltype("");
            newResult.setCountrydata("");
            newResult.setNamedata("");
            newResult.setTinnumberdata("");
            LocalDate localDate = LocalDate.of(1900, 12, 31);
            newResult.setBirthdate(DatatypeFactory.newInstance().newXMLGregorianCalendar(localDate.toString()));
            res.getMatchResult().add(newResult);
        }
        else {
            for (WlmwldataFind result : matchResult) {
                WlmwldataFindXML newResult = new WlmwldataFindXML();
                newResult.setBlcode(result.getBlcode());
                newResult.setBltype(result.getBltype());
                newResult.setCountrydata(result.getCountrydata());
                newResult.setNamedata(result.getNamedata());
                newResult.setTinnumberdata(result.getTinnumberdata());
                newResult.setBirthdate(DatatypeFactory.newInstance().newXMLGregorianCalendar( result.getBirthdate().toString()));
                res.getMatchResult().add(newResult);

            }
        }


        return res;
    }


}
