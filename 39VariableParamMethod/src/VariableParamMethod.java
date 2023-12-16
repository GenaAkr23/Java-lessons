
public class VariableParamMethod {

	public static void main(String[] args) {
	
		System.out.println(VyrakhuvatySerednie(1,2,3,4,5));
		System.out.println(VyrakhuvatySerednie(15,34,46,75,89,1,45,23,11));

	}

	public static double VyrakhuvatySerednie(int...chysla) // можно использовать три точки, если не знаете сколько будет переменных
	{ 
	int suma=0; 
	for(int i: chysla)
		suma+=i; // або suma=suma+1
	return (double)suma/(double)chysla.length; // конвертація на лету
	}
}
