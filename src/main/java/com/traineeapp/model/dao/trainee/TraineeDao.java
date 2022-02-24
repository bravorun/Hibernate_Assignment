package com.traineeapp.model.dao.trainee;

import java.util.List;

public interface TraineeDao {
	public Trainee addTrainee(Trainee trainee);
	public List<Trainee> getAll();
}