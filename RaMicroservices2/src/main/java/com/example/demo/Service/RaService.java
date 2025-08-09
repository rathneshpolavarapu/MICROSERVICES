package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RaService {

	@Autowired
	private RaFeignclient ifa;
	
	public String getJetInfo() {
		
//		RestTemplate RT=new RestTemplate();
//		ResponseEntity<String> response = RT.getForEntity("http://localhost:8002/jetinfo",String.class);
//		
//		return response.getBody();
		ResponseEntity<String> response=ifa.getJetInfo();
		return response.getBody();
		
	}
	
}
