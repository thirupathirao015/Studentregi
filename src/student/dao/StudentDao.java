package student.dao;

import java.util.List;

import student.model.Student;

public interface StudentDao {
	public void add(Student student);
	public void edit(Student student);
	public void Delete(int studentId);
	public Student getStudent(int studentId);
	public List getAllStudent();

}
