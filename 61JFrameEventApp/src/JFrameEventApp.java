import javax.swing.JFrame;// автоматично імпортувався клас

public class JFrameEventApp {

	public static void main(String[] args) {
		
		Vikno v = new Vikno(); // ініціалізація класу Vikno()
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//остановка прогррами коли закривається вікно
		v.setTitle("Вікно з обробником подій");// установка завголовку вікна
		v.setSize(400, 150);// установка розмірів
		v.setLocationRelativeTo(null);//росполагає вікно по центру єкрана
		v.setVisible(true);// показ вікна на екрані
		
	
		
	}
}
