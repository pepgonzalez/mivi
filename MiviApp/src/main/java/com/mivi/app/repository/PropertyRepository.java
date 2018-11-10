package com.mivi.app.repository;
import org.springframework.data.repository.CrudRepository;

import com.mivi.app.domain.Property;

public interface PropertyRepository extends CrudRepository<Property, Long> {

}
