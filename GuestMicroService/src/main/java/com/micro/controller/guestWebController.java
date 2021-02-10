package com.micro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.model.guest;
import com.micro.repository.guestRepository;

@RestController
@RequestMapping("/guest")
public class guestWebController {

	private final guestRepository repository;

	public guestWebController(guestRepository repository) {
		super();
		this.repository = repository;
	}

	@GetMapping
	public Iterable<guest> getAllGuest() {
		return this.repository.findAll();
	}

	@GetMapping("/{id}")
	public guest getGuestById(@PathVariable("id") Integer id) {
		return this.repository.findById(id).get();
	}
}
