package com.niit.CollaborationBackendProject.Dao;

import com.niit.CollaborationBackendProject.model.UploadFile;

public interface FileUploadDao 
{
void save(UploadFile uploadFile);
UploadFile getFile(String username);
}
