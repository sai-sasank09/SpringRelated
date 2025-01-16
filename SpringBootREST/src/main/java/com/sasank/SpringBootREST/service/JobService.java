package com.sasank.SpringBootREST.service;

import com.sasank.SpringBootREST.model.JobPost;
import com.sasank.SpringBootREST.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {



    @Autowired
    private JobRepo repo;
    public void addJob(JobPost jobPost){
//        repo.addJob(jobPost);
        repo.save(jobPost);
    }
    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }

    public JobPost getJob(int id) {
        Optional<JobPost> s =repo.findById(id);
        return s.orElse(new JobPost());
    }

    public void updateJob(JobPost job) {
        repo.save(job);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }

    public void load() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1, "Java Dev", "Must have good knowledge in Java", 2, new ArrayList<>(Arrays.asList("hi", "hee"))),
                new JobPost(2, "Python Dev", "Must have good knowledge in Python", 3, new ArrayList<>(Arrays.asList("django", "flask"))),
                new JobPost(3, "Frontend Dev", "Must have good knowledge in React", 1, new ArrayList<>(Arrays.asList("React", "CSS"))),
                new JobPost(4, "Devops Dev", "Must have good knowledge in Devops", 1, new ArrayList<>(Arrays.asList("Devops", "Kubernates")))


        ));
        repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
      return  repo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}
