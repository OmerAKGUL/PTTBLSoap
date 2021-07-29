package com.mdsap.pttwl.repository;

import com.mdsap.pttwl.domain.Wlmwltype;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data repository for the Wlmwltype entity.
 */

@Repository
public interface WlmwltypeRepository extends CrudRepository<Wlmwltype, Long> {
}
