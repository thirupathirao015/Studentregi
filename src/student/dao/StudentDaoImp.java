package student.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import student.model.Student;
@Repository
public class StudentDaoImp implements StudentDao {
     private SessionFactory session; 
	@Override
	public void add(Student student) {
		 
		session.getCurrentSession().save(student);
       
	}

	@Override
	public void edit(Student student) {
		 
		session.getCurrentSession().update(student);

	}

	@Override
	public void Delete(int studentId) {

		session.getCurrentSession().delete(getStudent(studentId));

	}

	@Override
	public Student getStudent(int studentId) {
		 
		return (Student)session.getCurrentSession().get(Student.class, studentId);
	}

	@Override
	public List getAllStudent() {
		 
	return	 session.getCurrentSession().createQuery("from Student").list();
	}

}
