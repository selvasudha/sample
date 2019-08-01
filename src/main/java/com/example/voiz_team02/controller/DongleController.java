package com.example.voiz_team02.controller;

import com.example.voiz_team02.data.DongleRepository;

import com.example.voiz_team02.model.DonglePlans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;



import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/dongle")
public class DongleController {
    @Autowired
    private DongleRepository donRepo;


    @GetMapping
    public String showPlans(Model model){
        List<DonglePlans> plans=new ArrayList<>();
        donRepo.findAll().forEach(i->plans.add(i));
        model.addAttribute("plans",plans);
        return "dongle";
    }

}
