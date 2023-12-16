
public class TypyPeredachiArgumentiv {  // 25 марта 2023 года

//	public static void main(String[] args) 
//	{
//		// Приклад №1 Передача "по значенню"
//		int a=1, b=5;
//		int rez = OpratsjuvatyDani(a, b); // аргументи, які передаються методу
//		System.out.println(rez);
//		System.out.println(a);
//		System.out.println(b);
//	}
//	public static int OpratsjuvatyDani(int n1, int n2) // параметри, яки приймає метод
//	{
//		n1 = n1*10; n2 = n2*100;
//		return n1 + n2; 
//	}

	// Приклад №2 Передавання "за посиланням"
	public static void main(String[] args)// ці два методи працюють с одним масивом в памяті комп'ютора
	{
		int[] mijMasyv = {1,2,3}; 
		OpratsjuvatyDani(mijMasyv); // аргумент був переданий "за посиланням"
		for (int i: mijMasyv)
			System.out.println(i);
	}
	public static void OpratsjuvatyDani(int[] m) //ці два методи працюють с одним масивом в памяті комп'ютора
	{
		for (int index = 0; index<m.length; index++)
			m[index] = m[index]+1; 
	}	
}
