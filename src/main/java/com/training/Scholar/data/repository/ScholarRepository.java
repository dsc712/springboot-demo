package com.training.Scholar.data.repository;

import com.training.Scholar.data.entity.Scholar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScholarRepository extends CrudRepository<Scholar, Long> {

}
