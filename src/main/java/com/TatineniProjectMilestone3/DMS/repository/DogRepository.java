package com.TatineniProjectMilestone3.DMS.repository;

//@author Bhargavi Tatineni

import org.springframework.data.repository.CrudRepository;

import com.TatineniProjectMilestone3.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {

}
