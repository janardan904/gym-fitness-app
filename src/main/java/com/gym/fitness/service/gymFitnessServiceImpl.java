package com.gym.fitness.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.fitness.model.User;
import com.gym.fitness.repository.GymFitnessrepository;
@Service
public class gymFitnessServiceImpl implements IGymFitnessService {
   @Autowired
	private GymFitnessrepository repository;
	@Override
	public User RegisterUser(User user) {
  return  repository.save(user);
	}

	@Override
	public List<User> getallusers() {
		List<User> listuser=new ArrayList<User>();
		repository.findAll().forEach(user->listuser.add(user));
		return listuser;
	}

	@Override
	public Optional<User> getUserById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void deleteUser(Integer id) {
		 repository.deleteById(id  );

	}

	@Override
	public User updateUser(User user, Integer id) {
		
		
			return  repository.save(user);
		}

	

}
