package com.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.demo.entity.Student;
import com.springboot.demo.repository.StudentRepository;

@SpringBootApplication
public class SpringBootDemo1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo1Application.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1=new Student("Musembi","Joseph","musembijoseph99@gmail.com");
//		studentRepository.save(student1);
//		Student student2=new Student("Nicodems","Musembi","mrMusembi1@gmail.com");
//		studentRepository.save(student2);
//		Student student3=new Student("Boniface","Ndavuta","ndavuta4136@gmail.com");
//		studentRepository.save(student3);
//		Student student4=new Student("Nganda","Makenga","engineernganda@gmail.com");
//		studentRepository.save(student4);
	}

}
