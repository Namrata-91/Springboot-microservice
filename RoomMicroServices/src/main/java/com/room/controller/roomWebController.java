package com.room.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.room.model.room;
import com.room.repository.roomRepository;

@RestController
@RequestMapping("/rooms")
public class roomWebController {
	private final roomRepository repository;

	public roomWebController(roomRepository repository) {
		super();
		this.repository = repository;
	}

	@GetMapping
	public Iterable<room> getAllRooms() {
		return this.repository.findAll();
	}

	@GetMapping("/{id}")
	public room getRoomByID(@PathVariable("id") Integer id) {
		return this.repository.findById(id).get();
	}
}
