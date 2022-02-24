package com.traineeapp.model.service;

import java.util.List;

import com.traineeapp.model.dao.trainee.Trainee;
import com.traineeapp.model.dao.trainee.TraineeDao;
import com.traineeapp.model.dao.trainee.TraineeDaoImpl;

public class TraineeServiceImpl implements TraineeService{

	private TraineeDao traineeDao;
	
	public TraineeServiceImpl() {
		this.traineeDao = new TraineeDaoImpl();
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		return traineeDao.addTrainee(trainee);
	}

	@Override
	public List<Trainee> getAll() {
		return traineeDao.getAll();
	}

}
