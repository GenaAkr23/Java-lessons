import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*1*/public class Vikno extends JFrame{ // повінен наслідувати клас JFrame - імпортуемо йго
/*2*/	private JLabel lbl1; private JButton btnVstanovyty, btnVyterty;// добавляемо елементи і робимо імпорт
/*3*/	public Vikno(){// створюваемо конструктор класу Vikno
/*4*/		setLayout(new FlowLayout());//клас буде контролювати розмищення елементив в вікні і імпортуемо клас FlowLayout()
/*5*/		lbl1 = new JLabel("");// ініціалізуемо елементи і дві кнопки і додати іх на вікно	
/*6*/		add(lbl1);// і добавляемо на вікно за допомогою методу add()
/*18*/		obrobnykPodij op = new obrobnykPodij();// створюемо об'єкт цього класу
/*7*/		btnVstanovyty = new JButton("Встановити");// робим теж само з кнопками
/*8*/		add(btnVstanovyty);// і добавляемо на вікно за допомогою методу add()
/*19*/		btnVstanovyty.addActionListener(op);// додаемо до кнопкі обробник подій
/*9*/		btnVyterty = new JButton("Витерти"); add(btnVyterty);
/*20*/		btnVyterty.addActionListener(op);// робимо для другой кнопки
		}
/*16*/  public class obrobnykPodij implements ActionListener {	// створимо клас обробник подій (суб клас - клас в средине класу)
/*17*/		public void actionPerformed (ActionEvent p){// створити метод який буде запускати нашу подію. Повинен називатись actionPerformed - імпортуемо його
			// і примати один параметр ActionEvent - імпортуемо його
			// p - цей параметр може нам сказати чи була натиснута перша кнопка чи друга
/*21*/		if (p.getSource()==btnVstanovyty){// дизнаемось як це сталося
/*23*/		Calendar c = Calendar.getInstance();// покажемо в який час це зробил користувач - автоматично імпортувался клас 
/*24*/		// наступним кроком виведемо значеня дати
/*25*/		lbl1.setText("Кнопку натиснули в: "+c.getTime());// кнопку натиснули 
}
/*22*/      else if (p.getSource()==btnVyterty){ // повертає об'єкт в якому виконалася подія
/*26*/			lbl1.setText("");// ми зробимо щоб текст був очищений(порожній текст)
            }    	

		}
	}
}
