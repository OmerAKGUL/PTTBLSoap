package com.mdsap.pttwl.domain.model;

import java.time.LocalDate;
import java.util.Date;
/**
 * A WlmwldataFind.
 */
public class WlmwldataFind {

    private String namedata;
    private String countrydata;
    private String tinnumberdata;
    private LocalDate birthdate;
    private String blcode;
    private String bltype;



    public WlmwldataFind() {
        namedata = null;
        countrydata = null;
        tinnumberdata = null;
        bltype=null;
        birthdate=null;
    }
    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
    public String getNamedata() {
        return namedata;
    }


    public String getCountrydata() {
        return countrydata;
    }

    public String getTinnumberdata() {
        return tinnumberdata;
    }

    public void setNamedata(String namedata) {
        this.namedata = namedata;
    }

    public void setCountrydata(String countrydata) {
        this.countrydata = countrydata;
    }

    public void setTinnumberdata(String tinnumberdata) {
        this.tinnumberdata = tinnumberdata;
    }

    public String getBltype() {
        return bltype;
    }

    public void setBltype(String bltype) {
        this.bltype = bltype;
    }

    public String getBlcode() {
        return blcode;
    }

    public void setBlcode(String blcode) {
        this.blcode = blcode;
    }

    public void update() {
        if (namedata.length() == 0)
            namedata = null;
        if (tinnumberdata.length() == 0)
            tinnumberdata = null;
        if (countrydata.length() == 0)
            countrydata = null;

        namedata = replaceTurkishCharSet(namedata);
        tinnumberdata = replaceTurkishCharSet(tinnumberdata);
        countrydata = replaceTurkishCharSet(countrydata);


    }

    private String replaceTurkishCharSet(String val) {
        if (val == null)
            return null;
        val = val.replace("ç", "C");
        val = val.replace("Ç", "C");
        val = val.replace("ö", "O");
        val = val.replace("Ö", "O");
        val = val.replace("ğ", "G");
        val = val.replace("Ğ", "G");
        val = val.replace("ü", "U");
        val = val.replace("Ü", "u");
        val = val.replace("ı", "I");
        val = val.replace("İ", "I");
        val = val.replace("ş", "S");
        val = val.replace("Ş", "S");
        val = val.toUpperCase();

        return val;
    }

    @Override
    public String toString() {
        return "WlmwldataFind{" +
            "namedata='" + namedata + '\'' +
            ", countrydata='" + countrydata + '\'' +
            ", tinnumberdata='" + tinnumberdata + '\'' +
            ", blcode='" + blcode + '\'' +
            ", bltype='" + bltype + '\'' +
            '}';
    }
}
