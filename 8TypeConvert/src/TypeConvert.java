
public class TypeConvert {

	public static void main(String[] args) {
		
		// будь-який з простих типів можна конвертувати в String і назад
		double d = Double.parseDouble("12312341.123");
		int i = Integer.parseInt("1293781");
		
		String sd = String.valueOf(d);
		String si = String.valueOf(i);
		
		System.out.println(d + " : " + sd);
		System.out.println(i + " : " + si);
		
		// 7 int i = 5;
		//double d = i; // неявне (автоматичне) перетворення
		
		//double d1 = 5.5;
		//int i1 = (int) d1; // явне (неатоматичне, або ж ручне) з допомогою коду
		
		
		// 6 double d = 5.5;
		//int i = (int) d;
		//System.out.println(i);
		
		
		// 5 int i = 5;
		// double d = i;
		// System.out.println(d);
		
		
		// 4 float f = 2345345331298378912739.40f; // 32bit
		// int i = (int) f; // 32bit
		// System.out.println(i);
		
		
		// 3 double d = 2345345331298378912739.40; // double 64bit
		//short s = (short) d; // short 16bit
		//System.out.println(s);
		
		
		// 2 System.out.println("byte: " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
		//System.out.println("short: " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);
		//System.out.println("int: " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
		//System.out.println("long: " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
		//System.out.println("-------------------------------");
		//System.out.println("float: " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);
		//System.out.println("double: " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);
		
		// 1 boolean b = true;
		// char c = 'a';
		// byte by = 127;
		// short s = 32767;
		// int i = 2147483647; // 32 bit
		// long l = 9223372036854775807l;
		// float f = 3.4028235*(10^38);
		// double d = 1.797631348623157*(10^308);
		
		
	}

}
