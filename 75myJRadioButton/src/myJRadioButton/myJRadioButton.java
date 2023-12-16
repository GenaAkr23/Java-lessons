package myJRadioButton;

import javax.swing.JFrame;

public class myJRadioButton {

	public static void main(String[] args) {
		
		Vikno v = new Vikno("Вікно - JRadioButton");
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setSize(350, 400);
		v.setLocationRelativeTo(null);
		v.setVisible(true);

	}

}
