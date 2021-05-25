package com.practice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.practice.model.Issue;

@Repository
public interface IssueRepository extends MongoRepository<Issue, String>{

}
