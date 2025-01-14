package com.sasank.SpringBootREST;


import com.sasank.SpringBootREST.model.JobPost;
import com.sasank.SpringBootREST.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobRestController {
    @Autowired
    private JobService service;
    @GetMapping("jobPosts")
//    @ResponseBody
    public List<JobPost> getAllJobs(){
        return  service.getAllJobs();
    }

}
