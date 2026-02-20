package com.perin.demo.services;

import com.perin.demo.models.ProfessorModel;
import com.perin.demo.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<ProfessorModel> findAll () {return professorRepository.findAll();}
}
