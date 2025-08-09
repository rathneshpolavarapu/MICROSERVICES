package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RaController {
	
	@Autowired
	private Environment env;

	@GetMapping ("/jetinfo")
	public ResponseEntity<String> getJetInfo(){
		
		String pno=env.getProperty("server.port");

		String info="No other jet can beat this jet in Dogfight"+" "+pno;
		return new ResponseEntity<String>(info,HttpStatus.OK);
	}

}
