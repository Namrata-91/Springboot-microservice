package com.micro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.micro.model.guest;

@Repository
public interface guestRepository extends CrudRepository<guest, Integer> {

}
