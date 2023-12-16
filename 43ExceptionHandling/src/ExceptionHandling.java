import java.util.Scanner;

public class ExceptionHandling { // 3 апреля 2023 года

	public static void main(String[] args) {
		// спробувати
		try {
			System.out.println("Введіть своє улюблене число: ");
			Scanner s = new Scanner(System.in);
			int iChyslo = s.nextInt();
			System.out.println("Ваше улюблене число - " + iChyslo);
		} 
		// спіймати - якщо замість цифри буде текст, то буде помилка ImputMismatchException,
		// якщо поделити на нуль, або другу математичну операцію, буде помілка ArithmeticException
		catch (Exception spiymanaPomilka){
			System.out.println("Такого робити не можна! :(");
		} 
		
		System.out.println("Програма закінчила виконання");
		
		
		
		
		// 1 System.out.println("Введіть своє улюблене число: ");
		// Scanner s = new Scanner(System.in);
		// if (s.hasNextInt()) // цей метод повертає true(істину) и повертає фрагмент кода із тіла методу
		//{
		//	int iChyslo = s.nextInt();
		//	System.out.println("Ваше улюблене число - " + iChyslo);
		//}	
		//else {
		//	System.out.println("Введення не є цілим числом");
		//}
	}
	
}
