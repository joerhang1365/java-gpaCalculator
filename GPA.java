// Name: Joseph Hanger
// Date Created: September 20, 2022
// Last Date Modified: Septermber 22, 2022
// Description: This program takes the users grades and classes to calculate
// their GPA.

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import java.text.DecimalFormat;

public class GPA {

	public static void main(String[] args) {

		Font TimesNewRoman = new Font("Times New Roman", Font.PLAIN, 18);
		Color fontColor = new Color(0, 255, 51);
		Color backgroundColor = new Color(0, 0, 0);
		DecimalFormat twoDecimals = new DecimalFormat("#.00");

		UIManager.put("OptionPane.messageFont", TimesNewRoman);
		UIManager.put("OptionPane.messageForeground", fontColor);
		UIManager.put("OptionPane.background", backgroundColor);
		UIManager.put("Panel.background", backgroundColor);
		UIManager.put("OptionPane.okButtonText", "Next");

		String name;
		int qualityPoints, totalCreditHours;
		double gpa;

		// Introduction
		name = JOptionPane.showInputDialog(null,
			"Hello! This is a program to calculate your GPA. " +
			"\nTo start off please enter your name.",
			"Enter Name:");

		JOptionPane.showConfirmDialog(null, "Hi " + name + "! " +
			"\nEnter your information and we will calculate your GPA.",
			"GPA Caculator", JOptionPane.OK_CANCEL_OPTION);

		// Gather input
		JTextField grade1 = new JTextField();
		JTextField grade2 = new JTextField();
		JTextField grade3 = new JTextField();
		JTextField grade4 = new JTextField();
		JTextField hours1 = new JTextField();
		JTextField hours2 = new JTextField();
		JTextField hours3 = new JTextField();
		JTextField hours4 = new JTextField();

		Object[] input = {
			"First Class Letter Grade:", grade1,
			"Credit Hours:", hours1,
			"Second Class Letter Grade:", grade2,
			"Credit Hours:", hours2,
			"Third Class Letter Grade:", grade3,
			"Credit Hours:", hours3,
			"Last Class Letter Grade:", grade4,
			"Credit Hours:", hours4,
		};

		JOptionPane.showConfirmDialog(null, input, "GPA Calculator",
			JOptionPane.OK_CANCEL_OPTION);

		// Calculate GPA
		qualityPoints = 
			(int) ('F' - grade1.getText().charAt(0) - 1) *
			Integer.parseInt(hours1.getText()) +
			(int) ('F' - grade2.getText().charAt(0) - 1) *
			Integer.parseInt(hours2.getText()) +
			(int) ('F' - grade3.getText().charAt(0) - 1) *
			Integer.parseInt(hours3.getText()) +
			(int) ('F' - grade4.getText().charAt(0) - 1) *
			Integer.parseInt(hours4.getText());

		totalCreditHours = Integer.parseInt(hours1.getText()) +
			Integer.parseInt(hours2.getText()) +
			Integer.parseInt(hours3.getText()) +
			Integer.parseInt(hours4.getText());

		gpa = ((double) qualityPoints) / totalCreditHours;

		// Show GPA
		JOptionPane.showMessageDialog(null, name + ", your GPA is " +
			twoDecimals.format(gpa), "GPA Calculator",
			JOptionPane.PLAIN_MESSAGE);
	}

}