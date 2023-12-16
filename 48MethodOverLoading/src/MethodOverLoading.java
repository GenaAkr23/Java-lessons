
public class MethodOverLoading {
	// програма-додавака
	public static void main(String[] args) {
		
		System.out.println(Dodaty(1, 3));
		System.out.println(Dodaty(1, 3, 5));
		System.out.println(Dodaty("собака", "-барабака"));

	}
	
	// вимоги
	// 1. усі перевантажені методи повинні мати однакове ім'я
	// 2. усі перевантажені методи повинні відрізнятися "сигнатурою методу"
	
	public static int Dodaty(int a, int b){return a+b;} // перевантажанний метод
	public static int Dodaty(int a, int b, int c){return a+b+c;} // перевантажанний метод
	public static double Dodaty(double a, double b){return a+b;} // перевантажанний метод
	public static String Dodaty(String a, String b){return a+b;} // перевантажанний метод
	public static void Dodaty(){}
	public static int Dodaty(int[] iArray){
		int sum=0; for(int i: iArray){ sum+=i;} return sum;
	}
}
