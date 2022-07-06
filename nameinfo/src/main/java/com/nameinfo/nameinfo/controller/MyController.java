package com.nameinfo.nameinfo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nameinfo.nameinfo.entities.Info;
import com.nameinfo.nameinfo.services.InfoService;

@RestController
public class MyController {

	@Autowired
	public InfoService infoserve;
	@GetMapping("/home")
	public String home()
	{
		return "this is starting page";
	}
	//getting all info
	@GetMapping("/info")
	public List<Info> getinfo()
	{
		return this.infoserve.getInfo();
	}
	
	//get 1 info
	@GetMapping("/info/{id}")
	public Info get1info(@PathVariable String id)
	{
		return this.infoserve.get1Info(Long.parseLong(id));
	}
}
