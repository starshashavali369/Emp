package com.org.hcl.service;

import com.org.hcl.model.Emp;
import com.org.hcl.ropositary.EmpRopo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmpServiceImplTest {
    @InjectMocks
    private EmpServiceImpl empServiceImpl;
    @Mock
    private EmpRopo empRopo;

    @Test
    void createEmp() {
        Emp  emp=new Emp();
        emp.setId(100);
        emp.setName("Shasha");
        emp.setAddress("Blr");
        empServiceImpl.createEmp(emp);
        Mockito.verify(empRopo,Mockito.times(1)).save(emp);
    }

    @Test
    void updateEmp() {
        Emp  emp=new Emp();
        emp.setId(100);
        emp.setName("Shasha");
        emp.setAddress("Blr");
        empServiceImpl.updateEmp(emp);
        Mockito.verify(empRopo,Mockito.times(1)).save(emp);


    }

    @Test
    void getByIdEmp() {
        int id =198;
        Emp emp= new Emp();
        emp.setName("shashaavali");
        emp.setMailId("starshashavali@gmail.com");
        Optional<Emp>s=Optional.of(emp);
        Mockito.when(empRopo.findById(id)).thenReturn(s);
        Optional<Emp>ss=empServiceImpl.getByIdEmp(id);
        Assertions.assertEquals(s,ss);
    }

    @Test
    void deleteById() {
        int id =108;
        String s="success";
        String t=empServiceImpl.deleteById(id);
        Mockito.verify(empRopo,Mockito.times(1)).deleteById(id);
        Assertions.assertEquals(s,t);
    }
}