package com.mivi.app.controller;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mivi.app.domain.Property;
import com.mivi.app.repository.PropertyRepository;

@RestController
public class PropertyController {

	@Inject
	private PropertyRepository propertyRepository;

	@RequestMapping(value = "/properties", method = RequestMethod.GET)
	public ResponseEntity<Iterable<Property>> getAllProperties() {
		Iterable<Property> allProperties = propertyRepository.findAll();
		return new ResponseEntity<>(allProperties, HttpStatus.OK);
	}

}