package student.controller;

import java.util.ArrayList;

import student.model.Student;
import student.model.StudentDao;
import student.view.Studentview;

public class StudentController {

	public Studentview view;
	public StudentDao dao;

	public StudentController(StudentDao dao, Studentview view) {
		this.view = view;
		this.dao = dao;

	}

	public void run() {
		boolean f = true;
		while (f) {

			int choice = view.showMenu();
			switch (choice) {
			case 1: {
				String name = view.getName();
				int age = view.getAge();
				Student st = new Student(name, age);
				dao.insert(st);
			}
				break;
			case 2:{
				String name = view.getName();
				int id = view.getID();
				Student st = new Student(id, name);
				dao.delete(st);
			}
				break;
			case 3:
			{
				int id = view.getID();
				Student st = new Student(id);
				dao.delete(st);
			}
				break;
			case 4: {
				ArrayList<Student> ar= dao.showData();
				for(Student st:ar) {
					st.display();
				}
			}
				break;
			case 5:{
					int i = view.getID();
					Student st = new Student(i);
					dao.random(st);
			}
				break;
			case 6:
				System.out.println("sorting");
				break;
			case 7:
				System.out.println("exit...");
				return;
			default:
				System.out.println("invalid number");

			}

		}
	}
}
