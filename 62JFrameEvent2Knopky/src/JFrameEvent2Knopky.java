import javax.swing.JFrame;// 15 - клас добавився автоматически

public class JFrameEvent2Knopky {

	public static void main(String[] args) {
/*10*/	Vikno v = new Vikno();
/*15*/	v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// закриваемо програму після закритя вікна
/*11*/   v.setTitle("дві кнопки");// завголовок вікна
/*12*/	v.setSize(350, 150);// встановити розмір вікна
/*13*/	v.setLocationRelativeTo(null);// центруемо вікно на екрані
/*14*/	v.setVisible(true);// робимо вікно відимим

	}

}
