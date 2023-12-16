import java.util.Scanner;

public class MetodParametry {

	public static void main(String[] args) {
		
		String mojeMisto = "Львів";
		double mojaVaga = 75.5;
		SkazhyPryvit("Ігор", mojeMisto, 25, mojaVaga);
		
		// 2 String mojeImya = "Ігор";
		//String mojeMisto = "Львів";
		//SkazhyPryvit(mojeImya, mojeMisto);
		
		
		//1 Scanner mijSkan = new Scanner(System.in);
		//System.out.println("Введіть своє им'я");
		//String imya = mijSkan.nextLine();
		//System.out.println("Введіть своє misto");
		//String misto = mijSkan.nextLine();
		//SkazhyPryvit(imya, misto);
	}

	public static void SkazhyPryvit(String imya, String misto, int vik, double vaga)
	{
		System.out.println("Привіт, " + imya + " з міста " + misto + "; вік " + vik);
		System.out.println("Вага: " + vaga);
	}
}
