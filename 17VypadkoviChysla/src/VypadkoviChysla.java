import java.util.Random;
import java.util.Scanner;
public class VypadkoviChysla {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random kubyk = new Random();
		int chysloZkubyka=0, variantKorystuvacha=0, sproba =0;
		do {
			System.out.print("Введіть число від 1 до 6: ");
			variantKorystuvacha = scan.nextInt();
			chysloZkubyka = 1 + kubyk.nextInt(6);
			System.out.println("А на кубику випало " + chysloZkubyka + ".");
			System.out.println("--------------------------");
			sproba++;
		}
		while (variantKorystuvacha != chysloZkubyka);
		System.out.println("Бінго! Ви вгадали з " + sproba + "  спроби!");
		
		// 1 int chyslo; // сюди ми будемо записувати число, яке випаде на кубику
		// for (int i = 0; i<=10; i++)
		// {
		//	int chysloZkubyka = 1 + kubyk.nextInt(6); // 0, 1, 2, 3, 4, 5
			// System.out.println(chysloZkubyka);
		// }

	}

}
