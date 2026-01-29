package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;


// Não precisa da notation nesse caso por herdar a notation do JpaRepository
public interface UserRepository extends JpaRepository<User, Long>{

}
