package com.cision.assignment.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cision.assignment.model.Message;
import com.cision.assignment.repository.MessageRepository;

@Controller
public class MessageController {
	
	@Autowired
	protected MessageRepository messageRepository;
	@RequestMapping(value = "/postcontent", consumes = "application/json")
    public @ResponseBody boolean postMessage(@Valid @RequestBody Message message) {
		messageRepository.save(message);
        return true;
    }
}
