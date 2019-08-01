package com.example.postpaid.data;
import com.example.postpaid.model.Postpaidplan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostpaidRepositary  extends MongoRepository<Postpaidplan,String>{
}
