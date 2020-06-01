package com.pfe.system.erp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.system.erp.request.MailRequest;
import com.pfe.system.erp.response.MailResponse;
import com.pfe.system.erp.services.EmailService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("email")
public class EmailServiceController {
	
	@Autowired
	private EmailService service;

	@PostMapping("/sendingEmail")
	public MailResponse sendEmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("location", "France");
		return service.sendEmail(request, model);

	}

}
