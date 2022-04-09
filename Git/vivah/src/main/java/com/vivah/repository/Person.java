package com.vivah.repository;

import com.vivah.entity.Male;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Person extends CrudRepository<Male, Integer> {

}
