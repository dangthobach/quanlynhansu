package vn.qlns.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.qlns.model.Bu;
import vn.qlns.model.Staff;
import vn.qlns.model.StaffDTO;
import vn.qlns.service.BuService;
import vn.qlns.service.StaffService;

@Controller
public class HomeController {
	@Autowired
	BuService buService;
	
	@Autowired
	StaffService staffService;
	

	@RequestMapping("/")
	public String listAll(Model model) {
		
		List<StaffDTO> list= buService.listAll();
		model.addAttribute("staffList", list);
		return "home";
	}
	
	@RequestMapping("/add")
	public String add(Model model) {
		Staff staff= new Staff();
		model.addAttribute("staff", staff);
		return "addStaff";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addStaff(@ModelAttribute("staff") Staff staff, HttpServletRequest request) {
		
		staffService.save(staff);
		return "addStaff";
	}
	

	
	
}
