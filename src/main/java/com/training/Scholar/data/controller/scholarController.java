package com.training.Scholar.data.controller;

import com.training.Scholar.data.entity.Scholar;
import com.training.Scholar.data.repository.ScholarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/scholars")
public class scholarController {
    @Autowired
    private ScholarRepository scholarRepository;

    @GetMapping("")
    public Iterable<Scholar> getScholars() {
        return this.scholarRepository.findAll();
    }
}
