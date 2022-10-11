package com.mvc.model;

import java.util.Optional;
import com.mvc.model.Student;
import java.io.FileInputStream;
import java.io.InputStream;



public class StudentService {

	public Optional<Student> getStudent(int id) {
		switch (id) {
			case 1:
				return Optional.of(new Student(1,"qwe", "asd"));
			default:
				return Optional.empty();
		}
	}
}
