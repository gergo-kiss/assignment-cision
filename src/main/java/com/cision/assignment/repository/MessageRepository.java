package com.cision.assignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cision.assignment.model.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, String> {}