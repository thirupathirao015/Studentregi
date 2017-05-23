package student.service;

import java.util.List;

import student.model.Student;

public interface StudentService {
	public void add(Student student);
	public void edit(Student student);
	public void Delete(int studentId);
	public Student getStudent(int studentId);
	public List getAllStudent();

}
