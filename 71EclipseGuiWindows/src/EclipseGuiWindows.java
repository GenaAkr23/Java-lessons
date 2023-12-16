import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EclipseGuiWindows {

	private JFrame myWindow;
	private JTextField textField;/* frame2;*/

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EclipseGuiWindows window = new EclipseGuiWindows();
					window.myWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EclipseGuiWindows() {
		initialize();
		//initialize2();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		myWindow = new JFrame();
		myWindow.setBounds(100, 100, 450, 300);
		myWindow.setLocationRelativeTo(null);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(168, 101, 86, 20);
		myWindow.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Yo");
			}
		});
		btnNewButton.setBounds(165, 160, 89, 23);
		myWindow.getContentPane().add(btnNewButton);
	}
}
