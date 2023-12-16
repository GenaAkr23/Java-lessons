package JListApp;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class JListApp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListApp window = new JListApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JListApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 35, 120, 163);
		frame.getContentPane().add(scrollPane);
		
		JList list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				//дизнаємось який елемент виделив наш користувач
				//кажемо Джаві - знайди елемент list 
				//знайди вибране корустовучем значення getSelectedValue()
				//поверни нам текстове представлення цього значення toString()
				String color/*змінна типу String*/ = list.getSelectedValue().toString();
				//проверямо який колір було вибрано
				switch (color){
				case "Червоний"://якщо колір Червоний
					//значит наше вікно frame
					//отримати панель яка знаходиться в середині нашого вікна getContentPane()
					//встановити колір setBackground (Color.RED)
					frame.getContentPane().setBackground(Color.RED);
					break;
				case "Зелений":
					frame.getContentPane().setBackground(Color.GREEN);
					break;
					default:
						frame.getContentPane().setBackground(Color.GRAY);
						break;	
						
				}
				
				
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Червоний", "Зелений", "Жовтий", "Фіолетовий", "Сірий", "Голубий", "Білий", "Коричневий", "Рожевий", "Розово-жовтій", "Біло-сірий"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
	}
}
