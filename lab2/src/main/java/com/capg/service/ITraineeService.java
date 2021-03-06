package com.capg.service;

import java.util.List;
import java.util.Optional;

import com.capg.model.Trainee;

public interface ITraineeService {

	
	public Trainee addTrainee(Trainee trainee);

	public void deleteTrainee(Integer traineeId);

	public Trainee modifyTrainee(Trainee trainee);

	public Trainee retrieveTrainee(Integer traineeId);

	public List<Trainee> retrieveAll();
	
}
