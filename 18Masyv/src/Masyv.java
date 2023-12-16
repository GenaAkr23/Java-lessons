
public class Masyv {

	public static void main(String[] args) {
		
		int[] chysla = {7, 9, 15}; // масив можно записать так
		chysla[1] = 999; // можно порядковому номеру масива присвоить другое число
		// 1 int[] chysla = new int[3];
		//chysla[0] = 7; chysla[1] = 9; chysla[2] = 15;
		// chysla[3] = 100; [3] три является четвертым порядковым номером (он за пределами масива)
		//  7,  9,  15
		// [0] [1] [2]
		System.out.println(chysla[0]); 
		System.out.println(chysla[1]);
		System.out.println(chysla[2]);
		
		// 1 int[] chisla;
		//chisla = new int[3];
		// виділити об'єм в памяті, достатнього розміру,
		// щоб записати 3 значення типу int
	}

}
