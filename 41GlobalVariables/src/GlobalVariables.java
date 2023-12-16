
public class GlobalVariables {   // 30 марта 2023 года
	
	public static int kava=0; // глобальна змінна
	public static void main(String[] args) {
		System.out.println(kava);
		kava=1;
		System.out.println(kava);
		DodatyKavy();
		System.out.println(kava);
		VypytyKavy();
		System.out.println(kava);
		
	}
	public static void DodatyKavy()
	{
		kava++;
	}
	public static void VypytyKavy()
	{
		kava=0;
	}
}
