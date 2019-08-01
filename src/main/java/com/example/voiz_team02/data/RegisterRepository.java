package com.example.voiz_team02.data;

import com.example.voiz_team02.model.Register;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public interface RegisterRepository extends MongoRepository<Register,String> {
ArrayList<Register> findByEmailAddressAndPassword(String emailAddress, String password);
}

