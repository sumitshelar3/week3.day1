package week3_day1_Assignment;

/* Assignment3 - Method overriding*/

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("This method is called from AxisBank class");

	}

	public static void main(String[] args) {

		AxisBank aB = new AxisBank();
		aB.deposit();

		BankInfo bI = new BankInfo();
		bI.deposit();
	}

}
