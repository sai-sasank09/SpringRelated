package com.sasank.JobApp.repository;

import com.sasank.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Dev", "Must have good knowledge in Java", 2, new ArrayList<>(Arrays.asList("hi", "hee"))),
            new JobPost(2, "Python Dev", "Must have good knowledge in Python", 3, new ArrayList<>(Arrays.asList("django", "flask"))),
            new JobPost(3, "Frontend Dev", "Must have good knowledge in React", 1, new ArrayList<>(Arrays.asList("React", "CSS")))
    ));

    public List<JobPost> getAllJobs(){
        return jobs;
    }
    public void addJob(JobPost jobPost){
        jobs.add(jobPost);
        System.out.println(jobs);
    }
}
