
public class Enum2 {

	public static void main(String[] args) {
		
		//1 Kolir k = Kolir.RED;
		//if (k == Kolir.RED){
		//	System.out.println("Колір - червоний");
		//} else {
		//	System.out.println("Колір не червоний");
		//}
		for (Kolir k: Kolir.values()){
			// 2 System.out.printf("%s%n", k);
			System.out.printf("%s %s%n", k, k.getRGB());
		}
		
	}
}
