package com.example.graalvm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/graal")
@Slf4j
public class GraalVMController {

	@GetMapping("/message")
	public String getMessage() {
		log.info("------GraalVM App--------");
		return "Welcome to GraalVMController Application..!!";
	}

}
