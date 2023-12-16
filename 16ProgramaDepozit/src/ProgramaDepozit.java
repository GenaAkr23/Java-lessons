
class ProgramaDepozit {

	public static void main(String[] args) {
		
		// вклад = 100 грн
		// відсоток = 20%
		// 100 + (100*0.2) = 120 грн
		
		// Balans = Vklad * (1 + Vidsotok)^kRokiv;
		// Balans = 100 * (1 + 0.2)^5;
		double vklad = 1000, vidsotok = 0.2, balans = 0;
		int rikVkladu = 2023;
		for (int rik = rikVkladu; rik <= (rikVkladu + 10); rik++)
		{
			balans = vklad * Math.pow(1 + vidsotok, (rik - rikVkladu + 1));
			System.out.println("Баланс на кінец " + rik + " року: " + balans);
		}

	}

}
