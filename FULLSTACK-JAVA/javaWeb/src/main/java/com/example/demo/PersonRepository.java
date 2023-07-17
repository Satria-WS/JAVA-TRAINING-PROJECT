package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

//the type we have is a person and the key the ID key is of type long
public interface PersonRepository extends JpaRepository<Person , Long> {

}
