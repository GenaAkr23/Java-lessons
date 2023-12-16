import javax.swing.JFrame;
public class SimpleGui {

	public static void main(String[] args) {
		Vikno v = new Vikno();
		//v.setSize(500, 300);//розмір вікна (ширина, висота)
		v.setSize(v.width, v.height);
		v.setLocationRelativeTo(null);// центруемо вікно на екрані
		v.setVisible(true);//зробити вікно видимим
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
