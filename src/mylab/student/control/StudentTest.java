package mylab.student.control;

import mylab.student.entity.Student;
import mylab.student.exception.InvalidGradeException;

public class StudentTest {
	public static void main(String[] args) {
		try {
			Student student = new Student();
			student.setStudentId("22107614101");
			student.setName("김민수");
			student.setMajor("컴퓨터공학");
			student.setGrade(3);
			
			System.out.println(student.getName()+"/"
					+student.getMajor()+"/"
					+student.getGrade()+"학년"
						);
		}
	
	catch (InvalidGradeException e) {
		System.out.println("Error 메시지 = " + e.getMessage());
	}
	}
}
