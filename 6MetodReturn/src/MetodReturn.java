
public class MetodReturn {

	public static void main(String[] args) {
		int suma = Suma(5, 12); // метод сума
		System.out.println(suma);
	}	
	public static int Suma(int a, int b)
	{
		int sumaChysel = a + b;
		return sumaChysel;
	}
		
		// 2 Nichogo();
		// String tekst = PovernuTekst();
		// int chyslo = PovernuChyclo(); 
		
		
		// 1 String rezultat = SkazhyPryvit("Віктор");
		// System.out.println(rezultat); // вивід результату на екран
	//}
	// метод, який ми викликаємо
	//public static String SkazhyPryvit(String imya)
	//{
		//String text = "Привіт, " + imya; //System.out.println("Привіт, " + imya);
		//return text;
	// 2 }
	//public static void Nichogo()
	//{
	//	System.out.println("Я не повертаю нічого");
	//}
	//public static String PovernuTekst()
	//{
		// або можно так return "якийсь текст";
		//String tekst = "якийсь текст";
		//return tekst;
	//}
	//public static int PovernuChyclo()
	//{
	//	return 5;

}
