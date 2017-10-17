package com.niit.CollaborationBackendProject.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Message 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Msg_Id;
    private String message;
 
 
public Message(String message, int Msg_Id) 
{
	this.message = message;
	this.Msg_Id = Msg_Id;
	
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public int getMsg_Id() {
	return Msg_Id;
}
public void setMsg_Id(int msg_Id) {
	Msg_Id = msg_Id;
}
 
}
