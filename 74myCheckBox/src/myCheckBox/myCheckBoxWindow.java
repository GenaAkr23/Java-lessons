package myCheckBox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class myCheckBoxWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myCheckBoxWindow window = new myCheckBoxWindow();
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
	public myCheckBoxWindow() {
		initialize();
	}
	double suma;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		suma = 0;
		
		frame = new JFrame();
		frame.setTitle("Ресторан");
		frame.setBounds(100, 100, 450, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Виберіть страви, які ви хочете замовити:");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(10, 11, 264, 14);
		frame.getContentPane().add(label);
		
		JLabel lblTotal = new JLabel("0");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotal.setBounds(155, 205, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		JCheckBox cbxMoloko = new JCheckBox("Молоко ($5)");
		cbxMoloko.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (cbxMoloko.isSelected()){
					suma+=5;//suma = suma + 5;
				} else {
					suma-=5;
				}
				lblTotal.setText(String.format("%.2f", suma));
				//"%.2f" - вевести дробове число з 2 символами після крапки/коми
			}
		});
		cbxMoloko.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbxMoloko.setBounds(10, 47, 135, 23);
		frame.getContentPane().add(cbxMoloko);
		
		JCheckBox cbxHerring = new JCheckBox("Оселедець ($2.50)");
		cbxHerring.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (cbxHerring.isSelected()){
					suma+=2.5;
				} else {
					suma-=2.5;
				}
				lblTotal.setText(String.format("%.2f", suma));	
			}
		});
		cbxHerring.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbxHerring.setBounds(10, 71, 135, 23);
		frame.getContentPane().add(cbxHerring);
		
		JCheckBox cbxBeer = new JCheckBox("Пиво ($2)");
		cbxBeer.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (cbxBeer.isSelected()){
					suma+=2;
				} else {
					suma-=2;
				}
				lblTotal.setText(String.format("%.2f", suma));	
			}
		});
		cbxBeer.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbxBeer.setBounds(10, 95, 97, 23);
		frame.getContentPane().add(cbxBeer);
		
		JCheckBox cbxCucumber = new JCheckBox("Малосольний огірок ($0.50)");
		cbxCucumber.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (cbxCucumber.isSelected()){
					suma+=0.5;
				} else {
					suma-=0.5;
				}
				lblTotal.setText(String.format("%.2f", suma));
			}
		});
		cbxCucumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbxCucumber.setBounds(10, 121, 198, 23);
		frame.getContentPane().add(cbxCucumber);
		
		JCheckBox cbxWatermelon = new JCheckBox("Кавун ($4)");
		cbxWatermelon.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (cbxWatermelon.isSelected()){
					suma+=4;
				} else {
					suma-=4;
				}
				lblTotal.setText(String.format("%.2f", suma));
			}
		});
		cbxWatermelon.setFont(new Font("Tahoma", Font.BOLD, 11));
		cbxWatermelon.setBounds(10, 147, 97, 23);
		frame.getContentPane().add(cbxWatermelon);
		
		JLabel label_1 = new JLabel("Сума замовлення ($):");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(10, 205, 135, 14);
		frame.getContentPane().add(label_1);
		
		
	}
}
