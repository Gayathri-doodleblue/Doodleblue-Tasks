package com.project.service;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.exception.ServiceException;
import com.project.model.DailyTaskTracker;
import com.project.model.UserInfo;
import com.project.repository.DailyTaskRepository;
import com.project.repository.UserInfoRepository;

import jakarta.transaction.Transactional;

@Service
public class DailyTaskService {
	
	@Autowired
	private UserInfoRepository repository;
	
	@Autowired
	private DailyTaskRepository dailyTaskRepository;
	public DailyTaskTracker addDetails(@RequestBody DailyTaskTracker dailyTaskTracker) //save login and logout details and calculated hours work done
	{  try {
		double hoursWorked = dailyTaskTracker.getHoursWorked();
	    dailyTaskTracker.setHours_worked(hoursWorked);
		return dailyTaskRepository.save(dailyTaskTracker);	
	}
	catch (Exception e) {
		throw new ServiceException("605","Enter proper details");
	}
	}
	
	@Transactional
    public void updateProjectName()  // update project name
	{
       dailyTaskRepository.updateProjectName();
       
    }
	

	@Transactional
    public void updateClientName() //update client name
	{
       dailyTaskRepository.updateClientName();
       
    }
	@Transactional
    public void updateEmloyeeName() //update EmployeeName
	{
       dailyTaskRepository.updateEmployeeName();
       
    }
	

}
