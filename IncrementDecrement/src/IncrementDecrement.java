import java.util.Scanner;

public class IncrementDecrement {

	public static void main(String[] args) {
		Scanner vvedennaInfa = new Scanner(System.in);
		System.out.println("Введіть кількість морозива");
		//int morozyvo;
		//morozyvo = vvedennaInfa.nextInt();
		
		int kilkistMorozyva;
		kilkistMorozyva = vvedennaInfa.nextInt();
		
		kilkistMorozyva++; //  те ж саме, що: kilkistMorozyva = kilkistMorozyva + 1;
		kilkistMorozyva+=5; // те ж саме, що: kilkistMorozyva = kilkistMorozyva + 5; 
		
		System.out.println("Нова кількість: " + kilkistMorozyva);
		
		//morozyvo = morozyvo + 1;
		// morozyvo++;
		
		//System.out.print("Нова кількість:");
		//System.out.println(--morozyvo); // пре-денкремент
		//System.out.println(morozyvo--); // пост-денкремент  
		//System.out.println(morozyvo);
	}

}
