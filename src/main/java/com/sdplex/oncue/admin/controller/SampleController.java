package com.sdplex.oncue.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author goldbug
 * 샘플 컨트롤러
 */
@RestController
@RequestMapping("/sample")
public class SampleController {

	private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@GetMapping("/tab1")
	public String tab1() {
		return  sdf.format(new Date()) + " [restartedMain] o.s.s.web.DefaultSecurityFilterChain ";
	}

	@GetMapping("/tab2")
	public String tab2() {
		return  sdf.format(new Date()) + " [restartedMain] o.s.s.web.DefaultSecurityFilterChain ";
	}


	@GetMapping("/tab3")
	public String tab3() {
		return  sdf.format(new Date()) + " [restartedMain] o.s.s.web.DefaultSecurityFilterChain ";
	}


}
