package com.devsecops.employe.configuration;

import com.devsecops.employe.service.EmployeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.modelmapper.ModelMapper;

@Configuration
public class EmployeConfig {
    @Bean
    public EmployeService employeBean() {
        return new EmployeService();
    }
    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
}