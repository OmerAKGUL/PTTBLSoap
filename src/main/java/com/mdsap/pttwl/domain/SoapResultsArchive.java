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

/**
 * A Wlmwldata.
 */
@Entity
@Table(schema = "WLF", name = "soapresultsarchive")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SoapResultsArchive implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "archivedate")
    private Timestamp archivedate;

    @Column(name="matchtxnid")
    private Integer matchtxnid;

    @Column(name="matchscore")
    private BigDecimal matchScore;



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
    private String SearchBirthdate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public BigDecimal getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(BigDecimal matchScore) {
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

    public String getSearchBirthdate() {
        return SearchBirthdate;
    }

    public void setSearchBirthdate(String searchBirthdate) {
        SearchBirthdate = searchBirthdate;
    }
}
