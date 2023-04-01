package com.decoder135.cruddemo;

import com.decoder135.cruddemo.dao.StudentDAO;
import com.decoder135.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			System.out.println("Command Line Application Using SpringBoot.");
//			createStudent(studentDAO);

//			createMultipleStudents(studentDAO);
		};
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		// create multiple students

		System.out.println("Creating 3 student objects...");
		Student tempStudent1 = new Student("Dev", "Shukla", "dev@email.com");
		Student tempStudent2 = new Student("Devu", "Shukla", "devu@email.com");
		Student tempStudent3 = new Student("Omi", "Shukla", "omi@email.com");

		// save the student objects
		System.out.println("Saving the students....");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);


	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Devansh", "Shukla", "devansh@email.com");


		// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Student details saved. Generated id: " + tempStudent.getId());
	}
}
