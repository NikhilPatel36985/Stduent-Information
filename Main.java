package student;

import student.controller.StudentController;
import student.model.StudentDao;
import student.view.Studentview;

public class Main {
	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		Studentview view = new Studentview();
		StudentController controller = new StudentController(dao, view);
		controller.run();
	}

}
