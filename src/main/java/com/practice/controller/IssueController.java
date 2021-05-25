package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.practice.repository.IssueRepository;

@Controller
public class IssueController {
	private IssueRepository issueRepository;
	
	public IssueController(IssueRepository issueRepository) {
		this.issueRepository = issueRepository;
	}
	
	@GetMapping("/issues")
	public String getAllIssues(Model model) {
		model.addAttribute("issues",issueRepository.findAll());
		return "list-issues";
	}
}
