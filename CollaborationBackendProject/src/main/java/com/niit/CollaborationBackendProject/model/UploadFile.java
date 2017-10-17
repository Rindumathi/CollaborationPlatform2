package com.niit.CollaborationBackendProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="uploadFile_s180015")
public class UploadFile 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Uf_Id;
	private String fileName;
	private byte[] data; 
	private String username;
	public int getUf_Id() {
		return Uf_Id;
	}
	public void setUf_Id(int uf_Id) {
		Uf_Id = uf_Id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	

}
