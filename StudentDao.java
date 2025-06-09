package student.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDao {

	private final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/emp_table?useSSL=false";
	private final String USER = "root";
	private final String PSWD = "Nikhil";

	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PSWD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void insert(Student st) {
		try {

			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement("insert into student (name,age) values (?,?)");
			pst.setString(1, st.getName());
			pst.setInt(2, st.getAge());

			int i = pst.executeUpdate();
			if (i != 0) {
				System.out.println("success...");
			} else {
				System.out.println("some issue...");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(Student st) {
		try {

			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement("update student set name=? where id=?");
			pst.setString(1, st.getName());
			pst.setInt(2, st.getId());

			int i = pst.executeUpdate();
			if (i != 0) {
				System.out.println("update ..successfully...");
			} else {
				System.out.println("some issue...");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(Student st) {
		try {

			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement("delete from student where id=?");
			pst.setInt(1, st.getId());

			int i = pst.executeUpdate();
			if (i != 0) {
				System.out.println("success...");
			} else {
				System.out.println("some issue...");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Student> showData() {
		ArrayList<Student> ar = new ArrayList<Student>();
		try {

			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement("select*from student");

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int i = rs.getInt("id");
				String na = rs.getString("name");
				int ag = rs.getInt("age");
				ar.add(new Student(i,na,ag));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ar;
	}

	public ArrayList<Student> random(Student st) {
		ArrayList<Student> ar = new ArrayList<Student>();
		try {
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement("select*from student where id=?");
			pst.setInt(1, st.getId());
			
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int i = rs.getInt("id");
				String na = rs.getString("name");
				int ag = rs.getInt("age");
				System.out.println(i + "\t" + na + "\t" + ag);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ar;
	}
	
	

}
