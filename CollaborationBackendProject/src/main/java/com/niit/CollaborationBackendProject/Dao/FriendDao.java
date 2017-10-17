package com.niit.CollaborationBackendProject.Dao;

import java.util.List;

import com.niit.CollaborationBackendProject.model.Friend;

public interface FriendDao 
{
	List<Friend> getAllFriends(String username);
	void sendFriendRequest(String from,String to);
	List<Friend> getPendingRequest(String username);
	void updatePendingRequest(char Status,String from_Id,String to_Id);

}
