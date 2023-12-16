import javax.swing.JOptionPane;// javax.swing - дозволит вивести простеньке вікно на єкран
public class FirstGUI {

	public static void main(String[] args) {
		
		String imya = JOptionPane.showInputDialog("Введіть своє ім'я");
		// цей клас JOptionPane має метод showInputDialog
		String prizv = JOptionPane.showInputDialog("Введіть своє прізвище");
		
		String vitannya = String.format("Вітаємо у нашій першій віконній програмі, %s %s", imya, prizv);
		
		//JOptionPane.showInputDialog(vitannya);// клас JOptionPane - має богато інші методі
		//JOptionPane.showMessageDialog(null, vitannya, "Вітання", JOptionPane.YES_OPTION);// JOptionPane.PLAIN_MESSAGE - означає, виводимо простє звичайно повідомлення
		JOptionPane.showMessageDialog(null, vitannya, "Вітання", JOptionPane.PLAIN_MESSAGE);// після крапки класу JOptionPane. - можна вибрати і другі методи
	}// null - розмищення вікна по цетру  

}
