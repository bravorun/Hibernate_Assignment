package com.traineeapp.model.service;

import java.util.List;

import com.traineeapp.model.dao.trainee.Trainee;

public interface TraineeService {
	public Trainee addTrainee(Trainee trainee);
	public List<Trainee> getAll();

}
