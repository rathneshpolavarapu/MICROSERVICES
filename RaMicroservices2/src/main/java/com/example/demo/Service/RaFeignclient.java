package com.example.demo.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="RAMICROSERVICES1")
public interface RaFeignclient {
	
	
	@GetMapping ("/jetinfo")
	public ResponseEntity<String> getJetInfo();
}
