package com.reservation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.reservation.model.RoomReservation;
import com.reservation.model.room;

@RestController
@RequestMapping("/room-reservation")
public class RoomReservationWebService {

	// instance of restTemplate
	private final RestTemplate restTemplate;

	public RoomReservationWebService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	@GetMapping
	public List<RoomReservation> getRoomReservation() {
		List<room> rooms = this.getAllRooms();
		List<RoomReservation> roomreservationobj = new ArrayList<RoomReservation>();
		rooms.forEach(room -> {
			RoomReservation roomReservation = new RoomReservation();
			roomReservation.setRoom_number(room.getRoom_number());
			roomReservation.setName(room.getName());
			roomReservation.setRoom_Id(room.getRoom_Id());
			roomreservationobj.add(roomReservation);
		});
		return roomreservationobj;
	}

	private List<room> getAllRooms() {
		ResponseEntity<List<room>> roomResponce = this.restTemplate.exchange("http://ROOMMICROSERVICES/rooms",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<room>>() {
				});
		return roomResponce.getBody();
	}

}
