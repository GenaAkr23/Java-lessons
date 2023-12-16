import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vikno extends JFrame {
	int width = 500, height = 500;
	JButton btn1; // 1 JTextField txt1;
	
	public Vikno(){
		super("Моє вікно JFrame");// заголовок вікна
		// 2setLayout(new FlowLayout());//спосіб розміщення елементів FlowLayout
   /*3*/JPanel p = new JPanel();// виводить панель поверх вікна
		p.setOpaque(true);/*панель буде прозора*/p.setLayout(null);//панель заполнить весь простірь вікна
		
		
		// 1 txt1 = new JTextField(15); add(txt1);
		btn1 = new JButton("Натисни сюди"); 
		btn1.setLocation(25, 25);/*розмищення 25 з гори і 25 з ліва*/
		btn1.setSize(150, 30);//розмири нашей кнопки
		/*add(btn1);*/p.add(btn1);
		
		btn1.addActionListener(new obrobnykPodiyi());//прикріпити обробник
		btn1.addMouseListener(new obrobnykMyshkoPodij());
		
		setContentPane(p);//додати панель на вікно
	}
	public class obrobnykPodiyi implements ActionListener{//обробник події колі кнопка просто натиснута
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(null, "Привіт");
		}
	}
	public class obrobnykMyshkoPodij implements MouseListener{
		public void mouseEntered(MouseEvent e){//коли наведуть курсор на кнопку
			btn1.setBackground(Color.RED);
			Random r = new Random();
			btn1.setLocation(r.nextInt(width-150), r.nextInt(height-30));
		}
		public void mouseClicked(MouseEvent e){btn1.setBackground(null);}//коли натиснуть і відпустять кнопку
		public void mouseExited(MouseEvent e){btn1.setBackground(Color.YELLOW);}//коли наведе курсор на кнопку
		public void mouseReleased(MouseEvent e){btn1.setBackground(Color.GREEN);}//коли натисне і залише кнопку
		public void mousePressed(MouseEvent e){btn1.setBackground(Color.ORANGE);}//коли натисне кнопку і не відпустить
	
	}
}
