
public class VariableScope { // 29 марта 2023 год

	public static void main(String[] args) 
	{
		int moloko=1;
	// String moloko="біле"; // в теле одного метода может быть только одно название переменной
/*якщо*/	if(moloko==1)
		{
/*то*/			String rezultat = "moloko";
			System.out.println(rezultat);
		}
/*або*/		else
		{
			int rezultat = 123;
			System.out.println(rezultat);
		}
	}
	// 1 public static void Kotygoroshko()
	//{
	//	String moloko = "два";
	//}
	//public static void Rahkuvalka(double moloko)
	//{
	//	moloko = moloko*2;
	//}
}
