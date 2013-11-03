package com.peng.dao;

import java.util.Set;

import com.peng.model.*;

public interface UserDao {
	public void create(User u);
	public void delete(User u);
	public void update(User u);
	public User get(String username);
	public User getFirst();
	public Set<User> getAll();
}
