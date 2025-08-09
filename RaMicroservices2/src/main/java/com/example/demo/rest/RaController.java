package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.RaService;

@RestController
public class RaController {
	
	@Autowired
	private RaService ser;
	
	@GetMapping ("/Jet-info")
	public ResponseEntity<String> getJetInfo(){
		
		String info=ser.getJetInfo();
		return new ResponseEntity<String>(info,HttpStatus.OK);
	}

}
