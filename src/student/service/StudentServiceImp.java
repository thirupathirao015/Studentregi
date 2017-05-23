package student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import student.dao.StudentDao;
import student.model.Student;
@Service
public class StudentServiceImp implements StudentService {
     @Autowired
	private StudentDao studentDao;

     @Transactional
	public void add(Student student) {
    	 studentDao.add(student);
		 

	}

	@Transactional
	public void edit(Student student) {
		 studentDao.edit(student);

	}

	@Transactional
	public void Delete(int studentId) {
		 studentDao.Delete(studentId);

	}

	@Transactional
	public Student getStudent(int studentId) {
		 
		return studentDao.getStudent(studentId);
	}

	@Transactional
	public List getAllStudent() {
		 
		return studentDao.getAllStudent();
	}

}
