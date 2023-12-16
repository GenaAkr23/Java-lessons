import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import javax.swing.JButton;

public class ch1Layouts1 {

	private JFrame frame;
	private JPanel panel;
	private JTextField textField;
	private JButton btnNewButton;
	private JPanel panel_1;
	private JTextField textField_1;
	private JButton btnNewButton_1;
	private JRadioButton rdbtnRadio;
	private JPanel panel_2;
	private JButton btnNewButton_2;
	private JPanel panel_3;
	private final JPanel panel_4 = new JPanel();
	private JButton btnNewButton_4;
	private JButton btnNewButton_3;
	private JButton btnNewButton_5;
	private JTextField textField_2;
	//private JButton btn1, btn2, btn3, btn4, btn5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ch1Layouts1 window = new ch1Layouts1();
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
	public ch1Layouts1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 618, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(0, 0, 0, 0);
		panel_4.add(btnNewButton_4);
		
		btnNewButton_3 = new JButton("New button");
		panel.add(btnNewButton_3);
		
		btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton_1 = new JButton("New button");
		panel_1.add(btnNewButton_1);
		
		rdbtnRadio = new JRadioButton("Radio");
		frame.getContentPane().add(rdbtnRadio, BorderLayout.WEST);
		
		panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.EAST);
		
		btnNewButton_2 = new JButton("New button");
		panel_2.add(btnNewButton_2);
		
		panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		btnNewButton_5 = new JButton("New button");
		panel_3.add(btnNewButton_5);
	//	frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	//	frame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	//	FlowLayout flowLayout = new FlowLayout();
	//	flowLayout.setVgap(45);
	//	flowLayout.setHgap(25);
	//	frame.getContentPane().setLayout(flowLayout);
	//	frame.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 25, 45));
		
	//	btn1 = new JButton("Кнопка 1"); frame.getContentPane().add(btn1);
	//	btn2 = new JButton("Кнопка 2"); frame.getContentPane().add(btn2);
	//	btn3 = new JButton("Кнопка 3"); frame.getContentPane().add(btn3);
	//	btn4 = new JButton("Кнопка 4"); frame.getContentPane().add(btn4);
	//	btn5 = new JButton("Кнопка 5"); frame.getContentPane().add(btn5);
	}
}
