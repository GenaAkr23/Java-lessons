
public class PrintF {

	public static void main(String[] args) {
		
		String s1 = "місяць", s2 = "вареник", s3 = "динозавр";
		//System.out.println(s1);
		
		//System.out.printf("%s", s1); // %s - (String) - текстовий рядок
		//System.out.printf("%S", s1); // %S - (String) - текстовий рядок великими літерами
		//System.out.printf("%20s", s1); // %{n}s - текстовий рядок довжиною мінімум {n} символів
		//System.out.printf("%s,%s,%s", s1, s2, s3);// виведення більше ніж 1 значення
		
		
		int d1 = 123, d2 = 456, d3 = d1*d2; // D - digit= число
		//System.out.printf("%d", d1);
		//System.out.printf("%d*%d=%d", d1, d2, d3);
		//System.out.printf("%7d", d1); // %{n}d - рядок довжиною мінімум {n} символів
		//System.out.printf("%7d", d2);	
		//System.out.printf("%7d", d3);
		//System.out.printf("%7d\n", d1); // "\n" - переводить курсор на наступний рядок
		//System.out.printf("%7d\n", d2);	
		//System.out.printf("%7d\n", d3);
		
		double f1 = 123456789.01234; // f = "Floating point number"
		//System.out.printf("%f", f1); // %f - число з плаваючою точкою
		//System.out.printf("%.2f", f1); // заокруглити число до сотих
		//System.out.printf("%,.2f", f1);// розділювачі між тисячами і заокруглити до сотих
		//System.out.printf("%s,%s,%s", s1, s2, s3);// кількість аргументів і вказівників
		
		//System.out.printf("%d, %f, %s", d1, f1, s1);
		
		// %n (або \n) - ("new line") - переведення курсора на наступний рядок
		// %% - символ %, напр printf("нас 100%%"); => "нас 100%"
		// %c - (char) - один символ типу char
		// %C - (CHAR) - один символ типу char, конвертований у велику літеру
		// %b - (boolean) - значення булевого типу (true/false)
		// %e - (scientific notation) - експоненціальний запис (6,023224е23) - для чисел
		// %g - десятковий або експоненціальний запис в залежності від довжини числа - для чисел
		// %o - (octal) - вісімкова система числення - для чисел
		// %x - (hexadecimal) - шіснадцяткова система - для чисел
		// %h - (hash code) - хеш-значення тексту або числа
		// %a - шіснадцяткове число з плаваючою точкою (напр. 0x.1435D70D3)
		// %t{x} - поле об'єкта класу з кодом {x}, напр. printf("%tB", obj); - залежить від коду
	}

}
