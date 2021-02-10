package com.room.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class room {

	@Id
	@Column(name = "ROOM_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Room_Id;
	@Column(name = "Name")
	private String Name;
	@Column(name = "Room_Number")
	private String Room_number;
	@Column(name = "Size")
	private String Size;

	public void setRoom_Id(int room_Id) {
		Room_Id = room_Id;
	}

	public int getRoom_Id() {
		return Room_Id;
	}

	public String getName() {
		return Name;
	}

	public String getRoom_number() {
		return Room_number;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setRoom_number(String room_number) {
		Room_number = room_number;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

}
