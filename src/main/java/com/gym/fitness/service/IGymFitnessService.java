package com.gym.fitness.service;

import java.util.List;
import java.util.Optional;

import com.gym.fitness.model.User;

public interface IGymFitnessService {

	public User RegisterUser(User user);
	public List<User> getallusers();
	public Optional<User> getUserById(Integer id);
	public void deleteUser(Integer id);
	public User updateUser(User user,Integer id);
}
