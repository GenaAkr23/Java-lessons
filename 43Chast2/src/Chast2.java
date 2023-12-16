import java.util.Scanner;

public class Chast2 {

	public static void main(String[] args) {
	boolean yePomylka = false;	
	do {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Введить чисельник: ");
			int c1 = s.nextInt();
			System.out.println("Введіть знаменник: ");
			int c2 = s.nextInt();
			System.out.println("Результат: " + c1/c2);
			yePomylka = false;
		}
/*ловить*/  catch (Exception pomilka) {
			yePomylka = true;
			System.out.println("Такого робити не можна :( " + pomilka.getMessage());
		}
	}
	while (yePomylka); // або yePomylka==true
	}

}
