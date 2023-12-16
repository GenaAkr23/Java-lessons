package JListApp;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JListApp {

	private JFrame frame;
	private JTextField txtNewItem;

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
		scrollPane.setBounds(10, 11, 414, 211);
		frame.getContentPane().add(scrollPane);
		
		DefaultListModel myListModel = new DefaultListModel();
		myListModel.addElement("Hello");
		myListModel.addElement("Чупакабра");
		
		JList list = new JList();
		list.setModel(myListModel);
		
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				if (list.getSelectedIndex()>0){
				
				
				
			
				String color = list.getSelectedValue().toString();
				
				switch (color){
				case "Червоний":
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
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
//		list.setModel(new AbstractListModel() {
//			String[] values = new String[] {};
//			public int getSize() {
//				return values.length;
//			}
//			public Object getElementAt(int index) {
//				return values[index];
//			}
//		});
		
		JButton btnDelete = new JButton("Видалити");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			//це рядок коду дозволит отримати порядковий номер вибраного елемента (0, 1, ....)
			int selectedIndex = list.getSelectedIndex();
			//якщо жодного елемента не вибрано, то буде "-1"
			if (selectedIndex>=0){
				myListModel.remove(selectedIndex);
				//видалити елемент з вказаним порядковим номером
			}
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelete.setBounds(10, 226, 89, 30);
		frame.getContentPane().add(btnDelete);
		
		txtNewItem = new JTextField();
		txtNewItem.setBounds(109, 226, 216, 30);
		frame.getContentPane().add(txtNewItem);
		txtNewItem.setColumns(10);
		
		JButton btnAddNew = new JButton("Додати");
		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newItem = txtNewItem.getText();
				if (newItem.length()>0 && !myListModel.contains(newItem))
				{
					myListModel.addElement(newItem);
					txtNewItem.setText("");
				}
			}
		});
		btnAddNew.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddNew.setBounds(335, 226, 89, 30);
		frame.getContentPane().add(btnAddNew);
	}
}
