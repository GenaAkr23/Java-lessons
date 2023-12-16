import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JComboBoxLesson {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboBoxLesson window = new JComboBoxLesson();
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
	public JComboBoxLesson() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblCountry = new JLabel("Країна");
		lblCountry.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCountry.setBounds(49, 43, 46, 14);
		frame.getContentPane().add(lblCountry);

		JLabel lblFlag = new JLabel("");
		lblFlag.setBounds(119, 72, 217, 109);
		frame.getContentPane().add(lblFlag);

		JComboBox cbxCountry = new JComboBox();
		cbxCountry.addActionListener(new ActionListener() {//обробник подій
			public void actionPerformed(ActionEvent arg0) {
				String val = cbxCountry.getSelectedItem().toString();
				countryComboBoxChanger(val, lblFlag);
				//вибраний елемент
				//JOptionPane.showMessageDialog(frame, "Ви вибрали: " + val);


			}
		});
		//створити масив типу String
		String [] countries = new String [] {"-Виберіть-", "Бельгія", "Британія", "Іспанія", "Україна"};
		//список потрібно додати в меню
		for (int i = 0; i<countries.length; i++){
			cbxCountry.addItem(countries [i]);//додати елемент	
		}
		cbxCountry.setBounds(119, 41, 217, 20);
		frame.getContentPane().add(cbxCountry);


	}

	private void countryComboBoxChanger(String val, JLabel lblFlag){//значення зменилось
		switch (val){
//		case "-Виберіть-":
//			setImageToLabel(lblFlag, "blank.jpg");
//			break;
//		case "Бельгія":
//			setImageToLabel(lblFlag, "belgium.png");
//			break;
//		case "Британія":
//			setImageToLabel(lblFlag, "britan.png");
//			break;
//		case "Іспанія":
//			setImageToLabel(lblFlag, "ispan.png");
//			break;
//		case "Україна":
//			setImageToLabel(lblFlag, "ukraunian.png");
//			break;
		}
	}
	private void setImageToLabel(JLabel lbl, String imgName){
		//знайти "url" - адресу вказаного зображення на комп'ютері
		java.net.URL imgUrl = this.getClass().getResource("img/" + imgName);
		//створити об'єкт класу Icon, і присвоїти йому вибране зображення
		Icon imag = new ImageIcon(imgUrl);
		//встановити зображення у вказаний JLabel
		lbl.setIcon(imag);

	}
}
