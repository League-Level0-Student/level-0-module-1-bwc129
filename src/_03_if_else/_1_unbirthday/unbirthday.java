package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {

public static void main(String[] args) {
	String question = JOptionPane.showInputDialog("is your birthday today!");
	if (question.equals ("yes")) {
		String question2 = JOptionPane.showInputDialog("happy birthday!");
	}
	else  {
		String question3 = JOptionPane.showInputDialog("happy unbirthday!");
	}
}
}

