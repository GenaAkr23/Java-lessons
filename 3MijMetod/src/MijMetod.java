

public class MijMetod { // клас
 
	public static void main(String[] args) // метод запуска програми
	{
		SkazatyPryvit(); //  викликати метод	
	}
	public static void SkazatyPryvit()
	{
		System.out.println("Привіт!"); 
		SkazatyJakSpravy(); //  викликати метод
	}
	public static void SkazatyJakSpravy() // метод
	{
		System.out.println("Як справи?"); // тело метода
	}
}
