package com.org.hcl.ropositary;

import com.org.hcl.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRopo extends JpaRepository<Emp,Integer> {
}
