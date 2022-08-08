package com.org.hcl.service;

import com.org.hcl.model.Emp;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

public interface EmpService {
    public void createEmp(Emp emp);

    public void updateEmp(Emp emp);

    public Optional<Emp> getByIdEmp(int id);

    public String deleteById(int id);
}