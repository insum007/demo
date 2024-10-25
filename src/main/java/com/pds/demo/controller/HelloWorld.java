package com.pds.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pds.demo.entity.MessageTemplate;
import com.pds.demo.entity.MimeType;
import com.pds.demo.entity.Type;
import com.pds.demo.repository.MessageTemplateRespository;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("api/v1/demo")
public class HelloWorld {

	@Autowired
	private MessageTemplateRespository messageTemplateRespository;

//	public HelloWorld(MessageTemplateRespository messageTemplateRespository) {
//		this.messageTemplateRespository = messageTemplateRespository;
//	}

	@GetMapping()
	public ResponseEntity<MessageTemplate> getMessage(@RequestParam(value = "id") long id) {

		MessageTemplate response = messageTemplateRespository.findById(id).get();

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PostConstruct
	public void saveMessage() {
		MessageTemplate message = new MessageTemplate();
		message.setMessageId("M001");
		message.setMessage("Hello world");
		message.setType(Type.SMS);
		message.setMimeType(MimeType.TEXT);
		messageTemplateRespository.save(message);

	}

}
