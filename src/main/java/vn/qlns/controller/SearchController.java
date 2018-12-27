package vn.qlns.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.qlns.model.StaffDTO;
import vn.qlns.service.BuService;

@Controller
public class SearchController {
	
	@Autowired
	BuService buService;
	
	@RequestMapping("/search")
	public String searchbyFields(@ModelAttribute("key") String key, Model model) {
		
		List<StaffDTO>staffList = buService.findbyFields(key);
		
		
		model.addAttribute("staffList", staffList);
		
		return "home";
	}
}
