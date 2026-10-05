package com.devsecops.employe.repository;

import com.devsecops.employe.entite.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeRepo extends JpaRepository<Employe, Integer> {
}