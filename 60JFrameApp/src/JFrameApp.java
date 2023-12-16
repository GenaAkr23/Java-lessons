import javax.swing.JFrame;// 5 екліпс автоматично іьпортувал клас javax.swing.JFrame

public class JFrameApp {

	public static void main(String[] args) {
		
		Vikno v = new Vikno(); // 1 створюємо новий обєкт класу Vikno
		v.setSize(500, 200); // 2 викличімо наступний метод setSize(400, 200) - пікселей
		v.setVisible(true); // 3 щоб наше вікно було відимим
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 4 остановити дію, коли наше вікно закривається
		// JFrame.EXIT_ON_CLOSE - означає вийти зі програми коли вона закривається
		
	}

}
