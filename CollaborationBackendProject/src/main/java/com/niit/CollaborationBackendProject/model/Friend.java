package com.niit.CollaborationBackendProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="friend_s180015")
public class Friend 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Friend_Id;
	private String from_Id;
	private String to_Id;
	private char Status;
	public int getFriend_Id() {
		return Friend_Id;
	}
	public void setFriend_Id(int friend_Id) {
		Friend_Id = friend_Id;
	}
	public String getFrom_Id() {
		return from_Id;
	}
	public void setFrom_Id(String from_Id) {
		this.from_Id = from_Id;
	}
	public String getTo_Id() {
		return to_Id;
	}
	public void setTo_Id(String to_Id) {
		this.to_Id = to_Id;
	}
	public char getStatus() {
		return Status;
	}
	public void setStatus(char status) {
		Status = status;
	}
	
}
