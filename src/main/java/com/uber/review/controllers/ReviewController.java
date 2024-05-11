package com.uber.review.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReviewController {
    @PostMapping("/review")
    public String createReview() {

        return null;
    }
}
