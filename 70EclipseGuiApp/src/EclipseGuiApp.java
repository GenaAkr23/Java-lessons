import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class EclipseGuiApp {

	private JFrame frame;
	private JTextField txtMoijTekstovePole;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EclipseGuiApp window = new EclipseGuiApp();
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
	public EclipseGuiApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setLocationRelativeTo(null);// центруемо вікно на екрані
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblMijLabel = new JLabel("Ввести своє місто");
		lblMijLabel.setForeground(new Color(255, 255, 255));
		lblMijLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMijLabel.setBounds(37, 46, 144, 26);
		panel.add(lblMijLabel);
		
		txtMoijTekstovePole = new JTextField();
		txtMoijTekstovePole.setBounds(179, 51, 204, 20);
		panel.add(txtMoijTekstovePole);
		txtMoijTekstovePole.setColumns(10);
		
		JButton btnMoijKnopka = new JButton("Опрацювати");
		btnMoijKnopka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String imyaMista = txtMoijTekstovePole.getText();
				if (imyaMista.length()==0){
					JOptionPane.showMessageDialog(null, "Ви не ввели назву свого міста");
				} else {
					JOptionPane.showMessageDialog(null, imyaMista + " - гарне місто!");
				}
			}
		});
		btnMoijKnopka.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMoijKnopka.setBounds(175, 125, 124, 23);
		panel.add(btnMoijKnopka);
	}
}
