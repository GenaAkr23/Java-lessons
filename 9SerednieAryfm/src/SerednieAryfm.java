import java.util.Scanner;

public class SerednieAryfm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String vvedennya = "0.0";
		double suma = 0, serednie = 0, chyslo = 0;
		int kilkistChysel = 0;
		
		while(vvedennya.equals(".") != true)
		{
			chyslo = Double.parseDouble(vvedennya);
			suma = suma + chyslo;
			
			System.out.println("Введіть число або [.] щоб зупинитись: ");
			vvedennya = scan.nextLine();
			kilkistChysel++;
		}	
		serednie = suma/--kilkistChysel;
		System.out.println("Середнє з " + kilkistChysel + " чисел: " + serednie);
		
		
		
		// (a + b + c)/3
		// (a + b + c + d)/4
		// 1 Scanner scan = new Scanner(System.in); // (a + b + c)/n  (n - kilkist chysel)
		//int chyslo = 0, suma = 0, kilkistChysel = 0, serednie = 0;
		
		//while(kilkistChysel<3)
		//{
			//System.out.println("Введіть число: ");
			//chyslo = scan.nextInt();
			//suma = suma + chyslo;
			//kilkistChysel++;	
		//}
		//serednie = suma/kilkistChysel;
		//System.out.println("Середнє: " + serednie);
	}

}
