package com.TatineniProjectMilestone3.DMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.TatineniProjectMilestone3.DMS.Models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer>  {

}
