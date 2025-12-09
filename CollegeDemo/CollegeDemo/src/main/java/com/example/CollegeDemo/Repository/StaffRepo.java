package com.example.CollegeDemo.Repository;

import com.example.CollegeDemo.model.Staffs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepo extends JpaRepository<Staffs,Long> {
}
