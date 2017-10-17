package com.niit.CollaborationBackendProject.Dao;

import java.util.List;

import com.niit.CollaborationBackendProject.model.Job;

public interface JobDao 
{
	void postJob(Job job);
	List<Job> getAllJobs();
	Job getJobDetail(int Job_Id);

}
