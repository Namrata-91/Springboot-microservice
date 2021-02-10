package com.room.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.room.model.room;

@Repository
public interface roomRepository extends CrudRepository<room, Integer> {
}
