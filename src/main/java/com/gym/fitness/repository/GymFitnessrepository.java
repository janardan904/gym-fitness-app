package com.gym.fitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.fitness.model.User;

public interface GymFitnessrepository extends JpaRepository<User,Integer> {

}
