import java.util.Random;
import java.util.Scanner;

public class Lotto { // 24 марта 2023 г
 
	public static void main(String[] args) {
		
		// krok 1 отримати ввудення від користувача
		String[] chyslaVidKorystuvacha = OtrymatyVvedennyaVidKorystuvacha();
		
		// krok 2 - провести розіграш (вибрати 6 випадкових чисел)
		int[] tsejRozigrash = ProvestyRozigrash();
		
		// krok 3 - перевірити числа від користувача на співпадіння з виграшними
		int iKilkistSpivpadin = PerevirytyRezultat(chyslaVidKorystuvacha, tsejRozigrash);
		
		// krok 4 Вивести результат
		String vsiChyslaRozigrashu = KonvertyvatyMasyvVTekst(tsejRozigrash);
		
		System.out.println("У розіграші співпало ("+ vsiChyslaRozigrashu + "): " + iKilkistSpivpadin);
		
	}

	public static String[] OtrymatyVvedennyaVidKorystuvacha()
	{
		// krok 1 - отримати введення від користувача
		System.out.println("Введіть 6 чисел через кому (від 1 до 54): ");
		// "1,24,17,45,11,7"
		Scanner scan = new Scanner(System.in);
		String chysla = scan.nextLine();
		scan.close(); // закрити Сканер і очистити його з пам'яті
		// "1,24,17,45,11,7" -> split(",") -> String[] a = {"1","24","17","45","11","7"};
		String[] strMasyvVvedenyhChysel = chysla.split(",");
		return strMasyvVvedenyhChysel;
	}
	
	public static int[] ProvestyRozigrash()
	{
		// krok 2 - провести розіграш (вибрати 6 випадкових чисел)
				int[] tsejRozigrash = new int[6]; // В цей масив ми будемо записувати тільки
				// виграшні номери останнього тиражу (розіграшу)
				Random r = new Random();
				int iChysloRozigrashu = 0;
				while (iChysloRozigrashu!=6) // Ми не можемо використати цикл "for" в цій ситуації. Чому?
				{
					boolean chysloVzheIsnuje = false; // можливи значення типу boolean: false = брехня або true = правда
					int tseChyslo = r.nextInt(54)+1;
					
					for (int isnujuChyslo: tsejRozigrash)
					{
						if (isnujuChyslo==tseChyslo)
						{
							chysloVzheIsnuje = true;
							break;
						}
					}
					if (chysloVzheIsnuje!=true)
					{
					tsejRozigrash[iChysloRozigrashu++] = tseChyslo;
					}
				}	
				return tsejRozigrash;
	}
	
	public static int PerevirytyRezultat(String[] strMasyvVvedenyhChysel, int[] tsejRozigrash)
	{
		// krok 3 - перевірити числа від користувача на співпадіння з виграшними
		// strMasyvVvedenyhChysel: {"1","24","17","45","11","7"}
		// tsejRozigrash: {5, 35, 27, 11, 7, 1} 
		int iKilkistSpivpadin = 0;
		for (int k=0; k<strMasyvVvedenyhChysel.length; k++)
		{
			int chyslo = Integer.parseInt(strMasyvVvedenyhChysel[k]);
			for (int tseVygrashneChyslo: tsejRozigrash)
			{
				if (chyslo==tseVygrashneChyslo)
				{
					iKilkistSpivpadin++;
				}
			}
		}
		return iKilkistSpivpadin;
	}
	
	public static String KonvertyvatyMasyvVTekst(int[] chysla)
	{
		// krok 4 Вивести результат
		String vsiChyslaRozigrashu = "";
		for (int Chyslo: chysla)
		{
			vsiChyslaRozigrashu = vsiChyslaRozigrashu+ Chyslo + " ";
		}	
		return vsiChyslaRozigrashu;
	}
}
