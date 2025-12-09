package com.example.CollegeDemo.Controller;

import com.example.CollegeDemo.Service.StaffService;
import com.example.CollegeDemo.model.Staffs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Staff")
public class StaffContoller {
    @Autowired
    private StaffService StServ;

    @GetMapping("/getStaff")
    public List<Staffs> getstaffs(){
        return  StServ.getstaffs();
    }
    @PostMapping("/getpath")
    public Staffs addStaff(@RequestBody Staffs s){
        return StServ.addStaffs(s);
    }

}
