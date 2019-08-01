package com.example.voiz.controller;

import com.example.voiz.data.FeedbackRepository;
import lombok.extern.slf4j.Slf4j;
import com.example.voiz.model.Feedback;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@Controller

@RequestMapping("/feedback")
@SessionAttributes("feedback")
public class FeedbackController {
    private FeedbackRepository feedbackRepo;
    public FeedbackController(FeedbackRepository feedbackRepo){ this.feedbackRepo=feedbackRepo; }
    @ModelAttribute
    @GetMapping
    public String show_Feedback(Model model){
        model.addAttribute("feedback",new Feedback());
        return "feedback";
    }
    @PostMapping
    public String processFeedback(@Valid Feedback Feedback, Errors errors) {
        if (errors.hasErrors()) {
            return "feedback";
        }
        feedbackRepo.save(Feedback);
        return "feedback";
    }
}
