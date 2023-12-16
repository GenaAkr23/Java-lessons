import javax.swing.JFrame;
import java.awt.FlowLayout; // цей розміщує елемент у вікні, так щоб вони не заважали один одному
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;


public class Vikno extends JFrame { // клас Vikno наслідує можливості класу JFrame
	private JLabel lbl1; private JButton btn1;// декларируем елементи, які будут в нашому конструкторі 
	public Vikno(){ // конструктор
		
		setLayout(new FlowLayout()); // setLayout - метод класу JFrame
		lbl1 = new JLabel(""); // додаемо елементи у вікно
		add(lbl1); // віводимо елементи у вікно
		btn1 = new JButton("Натисни мене");// додаемо кнопку у вікно
		add(btn1); // додаемо кнопку на екран
		
		obrobnykPodij op = new obrobnykPodij();// новий об'єкт класу
		btn1.addActionListener(op);// обробник подій прикрепили до кнопкі
	}
	public class obrobnykPodij implements ActionListener{// це під клас класу Vikno()
		// він знає як відпрацевивати події
		public void actionPerformed/*(метод java)*/(ActionEvent podiya){
			String txt = lbl1.getText();//що буде відбуватись коли користувач натисні на кнопку
			lbl1.setText(txt+txt.length());
		}
	}
}
