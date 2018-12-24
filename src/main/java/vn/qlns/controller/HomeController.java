package vn.qlns.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.qlns.model.Bu;
import vn.qlns.service.BuService;

@Controller
public class HomeController {
	@Autowired
	BuService buService;
	@RequestMapping("/")
	public String login(Model model) {
		Set<Bu> list= new HashSet();
		list=buService.findAll();
		model.addAttribute("list", list);
		return "home";
	}
}
