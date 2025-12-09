package com.example.CollegeDemo.Service;

import com.example.CollegeDemo.Repository.StaffRepo;
import com.example.CollegeDemo.model.Staffs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    @Autowired
    private StaffRepo StRepo;


    public List<Staffs> getstaffs() {
        return StRepo.findAll();

    }

    public Staffs addStaffs(Staffs s) {
        return StRepo.save(s);
    }
}
