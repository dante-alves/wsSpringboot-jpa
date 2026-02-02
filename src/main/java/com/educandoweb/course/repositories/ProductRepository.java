package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;


// Não precisa da notation nesse caso por herdar a notation do JpaRepository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
