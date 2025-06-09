package student.model;

public class Student {

		private int id;
		private String name;
		private int age;
		
		public void display() {
			System.out.println("Id : "+id);
			System.out.println("Name : "+name);
			System.out.println("Age : "+age);
			System.out.println("----------------------------------");
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
		}
		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public Student(int id, String name, int age) {
			this.id = id;
			this.name = name;
			this.age = age;
		}
		public Student(int id) {
			this.id = id;
		}

		public Student(String name, int age) {
			this.name = name;
			this.age = age;
		}
		

		public Student() {

		}

	}

	
	
	

