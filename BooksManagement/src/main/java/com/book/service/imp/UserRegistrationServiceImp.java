package com.book.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.db.entity.UserRegistration;
import com.book.repository.UserRegistrationRepository;
import com.book.service.UserRegistrationService;
@Service 
public class UserRegistrationServiceImp implements UserRegistrationService {
	@Autowired
	private UserRegistrationRepository registrationRepository;

	@Override
	public void registration(UserRegistration reg) {
		registrationRepository.save(reg);
	}

}
