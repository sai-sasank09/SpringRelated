package com.sasank.SpringBootREST.repository;

import com.sasank.SpringBootREST.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Dev", "Must have good knowledge in Java", 2, new ArrayList<>(Arrays.asList("hi", "hee"))),
            new JobPost(2, "Python Dev", "Must have good knowledge in Python", 3, new ArrayList<>(Arrays.asList("django", "flask"))),
            new JobPost(3, "Frontend Dev", "Must have good knowledge in React", 1, new ArrayList<>(Arrays.asList("React", "CSS"))),
            new JobPost(4, "Devops Dev", "Must have good knowledge in Devops", 1, new ArrayList<>(Arrays.asList("Devops", "Kubernates")))


            ));

    public List<JobPost> getAllJobs(){
        return jobs;
    }
    public void addJob(JobPost jobPost){
        jobs.add(jobPost);
        System.out.println(jobs);
    }

    public JobPost getJob(int id) {
        for(JobPost job: jobs){
            if(job.getPostId()==id) return job;
        }
        return null;
    }

    public void updateJob(JobPost jobPost) {
        for(JobPost job:jobs){
            if(job.getPostId() == jobPost.getPostId()){
                job.setPostProfile(jobPost.getPostProfile());
                job.setPostDesc(jobPost.getPostDesc());
                job.setReqExperience(jobPost.getReqExperience());
                job.setPostTechStack(jobPost.getPostTechStack());

            }
        }
    }

    public void deleteJob(int postId) {
        for (JobPost job: jobs){
            if(job.getPostId()==postId){
                jobs.remove(job);
            }
        }
    }
}
