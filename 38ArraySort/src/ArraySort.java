import java.util.Arrays;

public class ArraySort { // 27 марта 2023 год

	public static void main(String[] args) { 
		
		int[] array = {3,1,9,5,4};
		// 1 SortAndPrint(array);
		BubbleSort(array);

	}

	public static void SortAndPrint(int[] m)  // метод який сортував масив з допомогою класу java.util.Arrays
	{
		Arrays.sort(m); // сортировка масива
		System.out.println(Arrays.toString(m)); // выводит отсортированный масив
		for (int i=m.length-1; i>=0; i--) // метод який виводит масив задом на перед 
			System.out.print(m[i] + " "); 
		System.out.println("");
	}
	
	public static void BubbleSort(int[] m) // метод для демонстрації і не для використання
	{
		int povtoriv = 0;
		boolean vidbulasZamina = true;
/*пока*/while(vidbulasZamina)
		{
			vidbulasZamina = false;
/*для*/	for(int i=0; i<m.length-1-povtoriv; i++)
		{
/*якщо*/	if(m[i]>m[i+1])
			{
				int tmp = m[i];
				m[i] = m[i+1];
				m[i+1] = tmp;
				vidbulasZamina = true;
			}
		}
			povtoriv++;
		}
		for(int i: m)
			System.out.print(i + " ");
	}
}
