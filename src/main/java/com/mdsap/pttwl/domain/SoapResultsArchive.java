package com.mdsap.pttwl.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * A Wlmwldata.
 */
@Entity
@Table(schema = "WLF", name = "soapresultsarchive")
public class SoapResultsArchive implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "archivedate")
    private Timestamp archivedate;

    @Column(name="matchctxnid")
    private Integer matchtxnid;

    @Column(name="matchscore")
    private int matchScore;


    @Column(name = "Searchusr")
    private String SearchUsr;

    @Column(name = "searchdept")
    private String SearchDept;

    @Column(name = "searchloc")
    private String SearchLoc;

    @Column(name = "searchapp")
    private String SearchApp;

    @Column(name = "searchtinnumberdata")
    private String SearchTinnumberdata;

    @Column(name = "searchnamedata")
    private String SearchNamedata;

    @Column(name = "searchcountrydata")
    private String SearchCountrydata;

    @Column(name = "searchbirthdate")
    private LocalDate SearchBirthdate;

    public SoapResultsArchive() {
        archivedate  = Timestamp.valueOf(LocalDateTime.now());
    }



    public Integer getId() {
        return id;
    }


    public Timestamp getArchivedate() {
        return archivedate;
    }

    public void setArchivedate(Timestamp archivedate) {
        this.archivedate = archivedate;
    }

    public Integer getMatchtxnid() {
        return matchtxnid;
    }

    public void setMatchtxnid(Integer matchtxnid) {
        this.matchtxnid = matchtxnid;
    }

    public int getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(int matchScore) {
        this.matchScore = matchScore;
    }

    public String getSearchUsr() {
        return SearchUsr;
    }

    public void setSearchUsr(String searchUsr) {
        SearchUsr = searchUsr;
    }

    public String getSearchDept() {
        return SearchDept;
    }

    public void setSearchDept(String searchDept) {
        SearchDept = searchDept;
    }

    public String getSearchLoc() {
        return SearchLoc;
    }

    public void setSearchLoc(String searchLoc) {
        SearchLoc = searchLoc;
    }

    public String getSearchApp() {
        return SearchApp;
    }

    public void setSearchApp(String searchApp) {
        SearchApp = searchApp;
    }

    public String getSearchTinnumberdata() {
        return SearchTinnumberdata;
    }

    public void setSearchTinnumberdata(String searchTinnumberdata) {
        SearchTinnumberdata = searchTinnumberdata;
    }

    public String getSearchNamedata() {
        return SearchNamedata;
    }

    public void setSearchNamedata(String searchNamedata) {
        SearchNamedata = searchNamedata;
    }

    public String getSearchCountrydata() {
        return SearchCountrydata;
    }

    public void setSearchCountrydata(String searchCountrydata) {
        SearchCountrydata = searchCountrydata;
    }

    public LocalDate getSearchBirthdate() {
        return SearchBirthdate;
    }

    public void setSearchBirthdate(LocalDate searchBirthdate) {
        SearchBirthdate = searchBirthdate;
    }
}
