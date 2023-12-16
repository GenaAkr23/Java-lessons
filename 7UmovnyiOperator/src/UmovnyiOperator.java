import java.util.Scanner;
public class UmovnyiOperator {

	public static void main(String[] args) {
		// 1-1000 - професори і викладачі
		// 1001 - 55000 - студенти
		// 55000 - ... - обслуговучий персонал
		System.out.println("Введіть свій номер:");
		Scanner skan = new Scanner(System.in);
		int id = skan.nextInt();
		System.out.println("Ціна для вас: " + ((id > 1000 && id < 55000) ? 2.0 : 3.0));
		
		
		// 2 double tsina = (id > 1000 && id < 55000) ? 2.0 : 3.0;
		
		// 1 double tsina = 0.0;
		//if (id > 1000 && id < 55000)
		//{
			//tsina = 2.0;
		//}
		//else
		//{
			//tsina = 3.0;
		//}
		//System.out.println("Ціна для вас: " + tsina);

	}

}
