package com.devsecops.employe.service;


import com.devsecops.employe.entite.Employe;
import com.devsecops.employe.repository.EmployeRepo;
import com.devsecops.employe.response.EmployeReponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

public class EmployeService {
    @Autowired
    private EmployeRepo employeRepo;
    @Autowired
    private ModelMapper mapper;
    public EmployeReponse getEmployeById(int id) {
        Optional<Employe> employee = employeRepo.findById(id);
        EmployeReponse employeResponse = mapper.map(employee, EmployeReponse.class);
        return employeResponse;
    }
}