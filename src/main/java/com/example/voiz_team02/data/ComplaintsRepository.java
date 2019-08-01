package com.example.demo.data;

import com.example.demo.model.Complaints;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ComplaintsRepository extends MongoRepository<Complaints,String>{

}
