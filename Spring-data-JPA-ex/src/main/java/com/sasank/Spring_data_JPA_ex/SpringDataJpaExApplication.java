package com.sasank.Spring_data_JPA_ex;

import com.sasank.Spring_data_JPA_ex.Repo.StudentRepo;
import com.sasank.Spring_data_JPA_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo= context.getBean(StudentRepo.class);
//
//		Student s1= context.getBean(Student.class);
//		Student s2= context.getBean(Student.class);
//		Student s3= context.getBean(Student.class);
//
//		s1.setRollNo(101);
//		s1.setName("Sasank");
//		s1.setMarks(80);
//
//		s2.setRollNo(102);
//		s2.setName("Guru");
//		s2.setMarks(88);
//
//		s3.setRollNo(103);
//		s3.setName("Ram");
//		s3.setMarks(90);
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

//		System.out.println(repo.findAll());
////		System.out.println(repo.findById(101));
//		Optional<Student> s= repo.findById(101);
//		System.out.println(s.orElse(new Student()));
		System.out.println(repo.findAllByName("Sasank"));
	}

}
