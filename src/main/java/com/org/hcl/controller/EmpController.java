package com.org.hcl.controller;
import com.org.hcl.model.Emp;
import com.org.hcl.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmpController {
    @Autowired
    EmpService empService;

    @PostMapping("/create")
    public void createEmp(@RequestBody Emp emp) {
        empService.createEmp(emp);
    }

    @PutMapping("/update")
    public void updateEmp(@RequestBody Emp emp) {
        empService.createEmp(emp);
    }
    @GetMapping("/getById/{id}")
    public Optional<Emp> getByIdEmp(@PathVariable int id){
        Optional<Emp>t=empService.getByIdEmp(id);
        return t;
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable int id) {
        String g=empService.deleteById(id);
        return g;

        }}
