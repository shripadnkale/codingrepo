package com.aws.bucket.s3demo.controller;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.aws.bucket.s3demo.service.StorageService;

@RestController
@RequestMapping("/file")
public class StorageController {
	
	@Autowired
	private StorageService service;
	
	@PostMapping("/upload")
	public String uploadFile (@RequestParam(value = "file") MultipartFile file) {
		
		service.uploadFile(file);
		return "file uploaed";
		
	}

}
