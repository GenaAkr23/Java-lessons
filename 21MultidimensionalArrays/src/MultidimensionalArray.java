
public class MultidimensionalArray {

	public static void main(String[] args) {
		
		int[][] lotto = {
				{2, 53, 32, 17, 43, 5},
				{44, 12, 39, 1, 6, 50},
				{17, 9, 8, 44, 19, 21},
				{54, 3, 29, 20, 4, 11},
				{26, 54, 4, 37, 41, 8},
				{12, 8, 47, 5, 23, 27},
				{51, 30, 9, 20, 42, 15}
		};
		for (int i=0; i<lotto.length; i++)
		{
			int sumaChyselRozigrashu = 0;
			for (int chyslo: lotto[i])
			{
				sumaChyselRozigrashu=sumaChyselRozigrashu+chyslo;
			}
		
			System.out.println("Сума чисел розіграшу №" + i + ": " + sumaChyselRozigrashu + "; \n");
			System.out.println("Середнє розіграшу №" + i + ": " + sumaChyselRozigrashu/lotto[i].length);
		}
		
		// 5 String[][] slova = new String[3][]; 
		// slova[1] = new String[] {"вода", "молоко", "сік", "", "мінералка"};
		/* тоб то перший елемент цього двовимірного масиву буде пустий
		*другий елемент буде теж масивом и матиме 5 елементів
		*третий елемент теж буде порожним
		*/
		
		// 4 String[][] dvovymirnyi = {
		// /*0*/{"футбол", "Африка"},
		// /*1*/{"комп'ютер", "мова", "сніг", "стіна"},
		// /*2*/{"java", "сонце", "редиска"}
		// };
		// for (int ryad = 0; ryad<dvovymirnyi.length; ryad++)
		// {
		// 	for (int stovp = 0; stovp<dvovymirnyi[ryad].length; stovp++)
		//	{
		//		System.out.println(dvovymirnyi[ryad][stovp]);
		//	}
		// }
		
	}
		
		// 3 String[][] dvovymirnyi = {
		//	/*0*/{"", ""},
		//	/*1*/{"", "", "", "", ""},
		//	/*2*/{"", "", "редиска"}
		//};
		//System.out.println(dvovymirnyi[2][2]);
		//}
		
		
		// 2 int[][] dvovymirnyi = {
		//		/*0*/{1, 25},
		//		/*1*/{2, 67, 777, 81, 999},
		//		/*2*/{5, 33, 2}
		//};
		//System.out.println(dvovymirnyi[1][2]);
		//}
		
		
		// 1              [0]   [1]  [2]
		//int [] chysla = {123, 1231, 3253}; // одновимірний масив, 1-dimensional array
		//chysla[1] = 1;
		//System.out.println(chysla[1]);
		
	}


