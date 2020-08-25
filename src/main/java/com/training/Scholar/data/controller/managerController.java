package com.training.Scholar.data.controller;

import com.training.Scholar.data.entity.Manager;
import com.training.Scholar.data.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/managers")
public class managerController {

    @Autowired
    private ManagerRepository managerRepository;

    @GetMapping("")
    public Iterable<Manager> getManagers() {
        return this.managerRepository.findAll();
    }
}
