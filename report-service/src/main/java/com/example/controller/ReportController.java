package com.example.controller;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/reports")
public class ReportController {

	@GetMapping
	public ResponseEntity<Object> report(){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(Arrays.asList("manish","fartiyal"));
	}
}
