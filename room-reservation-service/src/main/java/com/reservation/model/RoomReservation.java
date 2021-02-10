package com.reservation.model;

import java.util.Date;

public class RoomReservation {

	private Integer Room_Id;
	private Integer Guest_Id;
	private String Name;
	private String Room_number;
	private String First_name;
	private String Last_name;
	private Date reservationDate;
	public Integer getRoom_Id() {
		return Room_Id;
	}
	public Integer getGuest_Id() {
		return Guest_Id;
	}
	public String getName() {
		return Name;
	}
	public String getRoom_number() {
		return Room_number;
	}
	public String getFirst_name() {
		return First_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setRoom_Id(Integer room_Id) {
		Room_Id = room_Id;
	}
	public void setGuest_Id(Integer guest_Id) {
		Guest_Id = guest_Id;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setRoom_number(String room_number) {
		Room_number = room_number;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}
	public Date getReservationDate() {
		return reservationDate;
	}
}