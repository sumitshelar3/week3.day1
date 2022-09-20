package org.system;

		/* Assignment1-Single level inheritance*/
public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("To print Desktop Size");
	}

	public static void main(String[] args) {

		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();

	}

}
