package com.example.Lab1.md;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String getInfo()
	{
		return "hello";
	}

}
