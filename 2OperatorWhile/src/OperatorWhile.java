import java.util.Scanner;

public class OperatorWhile {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		String slovo = "";
		
		while (slovo.equals("чай") != true)
		{
			System.out.println("Хочу чай");
			slovo = skan.nextLine();
		}
		System.out.println("Дякую за чай!");
		
		
		
		
		
		// 1 int chyslo = 0;
		
		// while (chyslo!=7)
		//{
			//System.out.println("Введіть/вгадайте число між 0 і 10");
			//chyslo = skan.nextInt();
		//}
			//System.out.println("Ви вгадали, це число 7");

	}

}
