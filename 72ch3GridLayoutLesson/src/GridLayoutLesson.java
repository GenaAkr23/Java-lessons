import java.awt.ComponentOrientation;
import java.awt.GridLayout;

import javax.swing.*;

public class GridLayoutLesson {

	//main - головний метод, з якого завжди починається запуск програми
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("GridLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(300, 400);//вказуемо фіксований розмир вікна
		frame.pack(); // цей метод встановлює розміри вікна JFrame
		//опираючись на розміри елементів, які знаходяться у цьому вікні
		frame.setVisible(true);//вивести вікно на екран
		
		JPanel p = new JPanel();//додати у вікно панель на яку будемо додавати інши компоненти
		p.setLayout(new GridLayout(2, 3, 10, 10));//цим рядком коду ми вказали,
		//що розміщенням елементів на цій панелі "panel"
		//керуватиме менеджер розміщень GridLayout()
		frame.setLocationRelativeTo(null);
		p.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		JLabel lbl1 = new JLabel("lbl1"); p.add(lbl1);
		JButton btn1 = new JButton("btn1"); p.add(btn1);
		JTextField txt1 = new JTextField(); p.add(txt1);
		JButton btn2 = new JButton("btn2"); p.add(btn2);
		JTextField txt2 = new JTextField(); p.add(txt2);
		JLabel lbl2 = new JLabel("lbl2"); p.add(lbl2);
		frame.add(p);//додати панель у вікно
		
		
	}

}
