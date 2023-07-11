package com.gym.fitness.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="GYM_FITNESS")
@Data
public class User {
@Id
@GeneratedValue
private Integer id;
@Column
private String	firstName;
@Column
private String	lastName;
@Column
private String email;
@Column
private String mobileNo;
@Column
private Integer weight;
@Column
private Integer height;
@Column
private Integer bmi;
@Column
private String bmiResult;
@Column
private String trainer;
@Column
private String gender;
@Column
private String packages;
@Column
private String[] importent;
@Column
private String havebeenGym;
@Column
private String enquiry;



}
