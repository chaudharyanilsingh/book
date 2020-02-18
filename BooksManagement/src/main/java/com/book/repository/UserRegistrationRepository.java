package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.book.db.entity.UserRegistration;

import java.util.*;
@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistration,String> {

	UserRegistration findByEmail(String email);




	

}
