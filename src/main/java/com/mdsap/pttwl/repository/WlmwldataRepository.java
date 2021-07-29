package com.mdsap.pttwl.repository;

import com.mdsap.pttwl.domain.Wlmwldata;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * Spring Data repository for the Wlmwldata entity.
 */

@Repository
public interface WlmwldataRepository extends CrudRepository<Wlmwldata, Long> {

        List<Wlmwldata> findByNamedataContaining(String namedata, Pageable pageable);

        List<Wlmwldata> findOneByNamedata(String namedata);

        List<Wlmwldata> findOneByTinnumberdata(String tinnumberdata);

        List<Wlmwldata> findOneByNamedataAndTinnumberdata(String namedata, String tinnumberdata);

        List<Wlmwldata> findOneByNamedataAndCountrydata(String namedata, String countrydata);

        List<Wlmwldata> findOneByNamedataAndTinnumberdataAndCountrydata(String namedata, String tinnumberdata, String countrydata);

        List<Wlmwldata> findOneByTinnumberdataAndCountrydata(String tinnumberdata, String countrydata);

        List<Wlmwldata> findOneByNamedataAndTinnumberdataAndCountrydataAndBirthdatedata(String namedata, String tinnumberdata, String countrydata, LocalDate birthdate);

}
