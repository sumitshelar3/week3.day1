package week3_day1_Assignment;

	/* Assignment 4: Method overloading*/
public class Students {

	public void getStudentInfo(int id) {

		System.out.println("Get student ID Number: " + id);

	}

	public void getStudentInfo(int id, String name) {

		System.out.println("Get student ID Number: " + id + " & Name: " + name);

	}

	public void getStudentInfo(String E_mail, long phoneN) {
		System.out.println("Get student E-mail ID: " + E_mail + " & Phone Number: " + phoneN);
	}

	public static void main(String[] args) {

		Students s = new Students();
		s.getStudentInfo(5);
		s.getStudentInfo(2, "Aditi");
		s.getStudentInfo("adt@gmail.com", 1999900000);

	}

}
