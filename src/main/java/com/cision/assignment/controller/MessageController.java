package com.cision.assignment.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cision.assignment.model.Message;
import com.cision.assignment.repository.MessageRepository;
import com.cision.assignment.service.MessageService;

@Controller
public class MessageController {
	
	@Autowired
	protected MessageRepository messageRepository;
	
	@Autowired
	protected MessageService messageService;
	
	@RequestMapping(value = "/postcontent", consumes = "application/json")
    public @ResponseBody boolean postMessage(@Valid @RequestBody Message message) {
		messageService.calculateLongestPalindromeSize(message);
		messageRepository.save(message);
        return true;
    }
	
	@RequestMapping(value = "/getmessages", method = RequestMethod.GET)
	@ResponseBody
    public List<Message> getMessages() {
		List<Message> messages = new ArrayList<>();
		messageRepository.findAll().forEach(messages::add);
		return messages;
	}
	
}
