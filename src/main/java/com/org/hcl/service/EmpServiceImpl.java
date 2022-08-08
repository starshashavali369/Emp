package com.org.hcl.service;

import com.org.hcl.model.Emp;
import com.org.hcl.ropositary.EmpRopo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmpRopo empRopo;

    @Override
    public void createEmp(Emp emp) {
        empRopo.save(emp);
    }

    @Override
    public void updateEmp(Emp emp) {
        empRopo.save(emp);
    }

    @Override
    public Optional<Emp> getByIdEmp(int id) {
        Optional<Emp>ss=empRopo.findById(id);
        return ss;
    }

    @Override
    public String deleteById(int id) {
        empRopo.deleteById(id);
        return "success";
    }
}
