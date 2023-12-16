import java.util.Scanner;

public class ForLoopDecrement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть слово: ");
		String slovo = scan.nextLine();
		
		// п р и в і т
		// 0 1 2 3 4 5 6
		for (int i = slovo.length()-1; i>=0; i--)
		{
			System.out.print(slovo.substring(i, i +1));
		}
		
		// 2 for (int i=10; i>=0; i--)
		//{
		//	System.out.println(i);
		//}
		
		// 1 for (int i=0; i<=10; i++)
		//{
			//System.out.println(i);
		//}

	}

}
