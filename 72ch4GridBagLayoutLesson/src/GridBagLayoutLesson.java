import java.awt.*;

import javax.swing.*;


public class GridBagLayoutLesson {

	public static void main(String[] args) {
		JFrame f = new JFrame("GridBagLayout вікно");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(450, 200);
		f.setLocationRelativeTo(null);
		f.setResizable(false);// кажемо джаві, що нікто
		//не повинен мати можливість змінити розмір вікна
		
		
		// створити панель - і в цю панель додавати наши компоненти
		JPanel p = new JPanel(new GridBagLayout());//укажемо тип розміщення елементив в нашей панелі
		//треба зробити додатковий об'єкт
		//CONSTRAINT/*означає обмеження*/
		GridBagConstraints c = new GridBagConstraints();//створит сітку у вікні
		c.anchor = GridBagConstraints.LINE_END;
		c.gridx = 0; c.gridy = 0;
		p.add(new JLabel("Ім'я: "), c);//створення нового об'єкта new JLabel("Ім'я: ")
		// можна написати так
		//JLabel lbl1 = new JLabel("Ім'я: ");
		//p.add(lbl1, c);
		c.gridy++;
		p.add(new JLabel("Прізвище: "), c);
		c.gridy++;
		p.add(new JLabel("Email: "), c);
		c.gridy++;
		p.add(new JLabel("Логін: "), c);
		c.gridy++;
		p.add(new JLabel("Пароль: "), c);
		
		JTextField txtName = new JTextField(8);//число в дужках тут вказує
		//наскільки широким повинне бути це текстове поле
		c.anchor = GridBagConstraints.LINE_START;
		c.gridx = 1;/*2й стовпець*/ c.gridy = 0;/*1й рядок*/
		p.add(txtName, c);
		c.gridy++;
		p.add(new JTextField(8), c);
		c.gridy++;
		p.add(new JTextField(15), c);
		c.gridy++;
		p.add(new JTextField(12), c);
		c.gridy++;
		p.add(new JTextField(12), c);
		
		
		c.gridx = 1; c.gridy = 5; c.anchor = GridBagConstraints.CENTER;
		c.gridheight = 2;//вказує, що по висоті цей елемент повинен знаймати дві комірки
		c.gridwidth = 2;
		c.insets = new Insets(5,5,5,5);//відстань зверху, справа, знизу
		//від компонента до меж комірки
		c.fill = GridBagConstraints.VERTICAL;
		p.add(new JButton("Зберегти"), c);
		
		c.gridx = 0; c.gridy = 6;
		c.fill = GridBagConstraints.HORIZONTAL;
		p.add(new JLabel("бірка"), c);
		
		// додаем нашу панель в наше вікно використовуче додатковий метод
		//getContentPane()
		f.getContentPane().add(p);
		
		f.setVisible(true);//указує джаві - потрібно вивести вікно на екран
	}

}
