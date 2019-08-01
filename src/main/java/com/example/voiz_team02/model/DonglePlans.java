package com.example.voiz_team02.model;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document


public class DonglePlans {
    @Id
    private  String id;

    private  String scheme;
    private  String benefits;

    public DonglePlans(String id, String scheme, String benefits) {
   this.id=id;
   this.benefits=benefits;
   this.scheme=scheme;
    }
}
