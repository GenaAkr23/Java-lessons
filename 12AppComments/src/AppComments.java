
/**
 * цей клас дає приклад використання коментарів в JAVA
 * @author USER
 *
 */
public class AppComments {

	public static void main(String[] args) {
		
		// в цю змінну буде записано введення від користувача
		int chyslo = 0;
		/* ця зміння - це різниця двох чисел
		 * число a
		 * і число b
		 */
		int riznytsya = /*це якесь число*/ Vidnyaty(2, 1);
		
	}
	/**
	 * цей метод віднімає від першого числа друге і повертає рузультат
	 * @param a - це число, від якого будемо віднімати
	 * @param b - число, яке ми будемо віднімати
	 * @return повертає різницю чисел a і b
	 */
	public static int Vidnyaty(int a, int b)
	{
		int rezultat = a - b;
		return rezultat;
	}

}
