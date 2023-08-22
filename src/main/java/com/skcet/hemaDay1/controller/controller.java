package com.skcet.hemaDay1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
	@RequestMapping("/display")
	@ResponseBody
public String display() {
	return "HEMALATHA MANOHARAN";
}
}
