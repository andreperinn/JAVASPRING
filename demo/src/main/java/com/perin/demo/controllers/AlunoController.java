package com.perin.demo.controllers;

import com.perin.demo.models.AlunoModel;
import com.perin.demo.services.AlunoService;
import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/schools")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List <AlunoModel> findAll(){
        return alunoService.findAll();
    }
}
