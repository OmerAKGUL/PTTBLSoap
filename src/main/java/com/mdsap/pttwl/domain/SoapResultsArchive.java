package com.mdsap.pttwl.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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



    @Column(name = "sorgu_id")
    protected int sorguId;
    @Column(name = "merkez_no")
    protected int merkezNo;
    @Column(name = "sube_no")
    protected int subeNo;
    @Column(name = "gise_no")
    protected int giseNo;
    @Column(name = "sicil_no")
    protected int sicilNo;
    @Column(name = "islem_kanali")
    protected String islemKanali;
    @Column(name = "islem_tipi")
    protected String islemTipi;
    @Column(name = "islem_adi")
    protected String islemAdi;

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

    public int getSorguId() {
        return sorguId;
    }

    public void setSorguId(int sorguId) {
        this.sorguId = sorguId;
    }

    public int getMerkezNo() {
        return merkezNo;
    }

    public void setMerkezNo(int merkezNo) {
        this.merkezNo = merkezNo;
    }

    public int getSubeNo() {
        return subeNo;
    }

    public void setSubeNo(int subeNo) {
        this.subeNo = subeNo;
    }

    public int getGiseNo() {
        return giseNo;
    }

    public void setGiseNo(int giseNo) {
        this.giseNo = giseNo;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getIslemKanali() {
        return islemKanali;
    }

    public void setIslemKanali(String islemKanali) {
        this.islemKanali = islemKanali;
    }

    public String getIslemTipi() {
        return islemTipi;
    }

    public void setIslemTipi(String islemTipi) {
        this.islemTipi = islemTipi;
    }

    public String getIslemAdi() {
        return islemAdi;
    }

    public void setIslemAdi(String islemAdi) {
        this.islemAdi = islemAdi;
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
