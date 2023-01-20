package student.database;

import java.util.Scanner;

public class Student {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	StudentInterface s1=new StudentImpliments();
	while(true) {
		System.out.println("1:addstudent\n2:deletestudent\n3:updatestudent\n4:getallstudent\n5:getbyid\n6:deleteAll");
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
		s1.addStudent();
		break;
		
		case 2:
			s1.deleteStudent();
			break;
		case 3:
			s1.updateStudent();
			break;
		case 4:
			s1.GetAllStudent();
			break;
		case 5:
			s1.GetbyStudent();
			break;
		case 6:
			s1.deleteAllStudent();
			break;
	}
}
}
}
