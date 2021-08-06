package com.mdsap.pttwl.repository;

import com.mdsap.pttwl.domain.SoapResultsArchive;
import com.mdsap.pttwl.domain.Wlmwldata;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * Spring Data repository for the Wlmwldata entity.
 */

@Repository
public interface SoapResultArchiveRepository extends CrudRepository<SoapResultsArchive, Integer> {

}
