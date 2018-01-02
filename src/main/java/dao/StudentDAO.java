package dao;

import java.util.List;

import model.Student;



public interface StudentDAO {
	

    public void createStudent(Student student);
    
    public Student getStudentById(long id);
    public List<Student> getAllStudents();
    
    public void updateStudent(Student student);
    
    public void deleteStudent(long id);

}
