package myJRadioButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Vikno extends JFrame {

		private JTextField txtText;
		private Font fntPlain, fntBold, fntItalic, fntBoldItalic;
		private JRadioButton rdbPlain, rdbBold, rdbItalic, rdbBoldItalic;
		private ButtonGroup btnGrpFonts;
		
		public Vikno(String zagolovok){
			super(zagolovok);
			this.setLayout(new FlowLayout());
			txtText = new JTextField("Я вмію програмувати на Джава", 30);
			this.add(txtText);
			
			fntPlain = new Font("TimesRoman", Font.PLAIN, 14);
			fntBold = new Font("TimesRoman", Font.BOLD, 14);
			fntItalic = new Font("TimesRoman", Font.ITALIC, 14);
			fntBoldItalic = new Font("TimesRoman", Font.BOLD+Font.ITALIC, 14);
			
			txtText.setFont(fntPlain);
			
			rdbPlain = new JRadioButton("звичайний", true); add(rdbPlain);
			rdbBold = new JRadioButton("жирний", false); add(rdbBold);
			rdbItalic = new JRadioButton("похилий", false); add(rdbItalic);
			rdbBoldItalic = new JRadioButton("жирний+похилий", false); add(rdbBoldItalic);
			
			btnGrpFonts = new ButtonGroup();
			btnGrpFonts.add(rdbPlain); btnGrpFonts.add(rdbBold);
			btnGrpFonts.add(rdbItalic); btnGrpFonts.add(rdbBoldItalic);
			
			rdbPlain.addItemListener(new RdbEventHandLerClass(fntPlain));
			rdbBold.addItemListener(new RdbEventHandLerClass(fntBold));
			rdbItalic.addItemListener(new RdbEventHandLerClass(fntItalic));
			rdbBoldItalic.addItemListener(new RdbEventHandLerClass(fntBoldItalic));
		}
		
		private class RdbEventHandLerClass implements ItemListener{
			private Font fnt;
			//конструктор - створює новий об'єкт цього класу
			//і задає значення "приватних" змінних
			public RdbEventHandLerClass(Font f){
				fnt = f;
			}
			//автоматично виконується, коли стан об'єкта змінюється
			//в цьому випадку об'єкт - це JRadioButton
			public void itemStateChanged(ItemEvent e){
				txtText.setFont(fnt);//встановити шрифт для txtText
			}
		}
		
}
