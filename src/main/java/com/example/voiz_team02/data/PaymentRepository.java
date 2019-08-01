package com.example.voiz_team02.data;


import com.example.voiz_team02.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
