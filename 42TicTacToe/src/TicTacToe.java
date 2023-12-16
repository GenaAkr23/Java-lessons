import java.util.Scanner;

public class TicTacToe { // 31 марта 2023 года 
	// фіксовані змінні, які вказують на вміст комірки
	// 1 public static final String POROZHNYA="   ";
	// public static final String KHRESTYK=" X ";
	// public static final String NULYK=" O ";
	public static final String POROZHNYA="   ", KHRESTYK=" X ", NULYK=" O "; // трі змінні записали в один рядок
	public static String aktyvnyiGravets;
	// змінні для зберігання інфо про ігрове поле і "стан гри"
	public static final int RYADKIV=3, STOVPCHYKIV=3;
	public static String[][] sitka = new String[RYADKIV][STOVPCHYKIV];
	public static int statusGry;
	public static final int STATUS_GRA_TRYVAE=0, STATUS_NICHYYA=1, 
			STATUS_PEREMOGA_X=3, STATUS_PEREMOGA_O=4;
	public static Scanner in= new Scanner(System.in);
	
	public static void main(String[] args) {
		PochatyGru();
		do{
			OtrymatyVvedennyaGravtsya();
			ProanalizuvatySitku();
			VyvestySitku();
			if (statusGry == STATUS_PEREMOGA_X){
				System.out.println("'X' переміг! Вітаємо!");
			} else if (statusGry == STATUS_PEREMOGA_O){
				System.out.println("'O' переміг! Вітаємо!");
			} else if (statusGry == STATUS_NICHYYA){
				System.out.println("Гра закінчилась внічию! До побачення!");
			}
			aktyvnyiGravets = (aktyvnyiGravets == KHRESTYK ? NULYK : KHRESTYK);
		}
		while (statusGry == STATUS_GRA_TRYVAE);
	}
	public static void PochatyGru(){
		for(int ryad=0; ryad<RYADKIV; ryad++){
			for(int stovp=0; stovp<STOVPCHYKIV; stovp++){
				sitka[ryad][stovp]=POROZHNYA;
			}
		}
		aktyvnyiGravets=KHRESTYK;
		VyvestySitku();
	}
	public static void OtrymatyVvedennyaGravtsya(){
		boolean vvedennyaDijsne=false;
		do{
		System.out.println("Гравець '"+aktyvnyiGravets+"', введіть рядок (1-3) і стовпчик (1-3) через пробел");
		int ryad=in.nextInt()-1; int stovp = in.nextInt()-1;
		if(ryad>=0 && ryad<RYADKIV && stovp>=0 && stovp<STOVPCHYKIV && sitka[ryad][stovp]==POROZHNYA)
		{
			sitka[ryad][stovp]=aktyvnyiGravets;
			vvedennyaDijsne=true;
		} else {
			System.out.println("Вибране розміщення (" + (ryad+1) + "," + (stovp+1)
					+ ") не може бути використане. Спробуйте ще раз...");
			}
		}
		while(!vvedennyaDijsne);  
	}
	
	public static void ProanalizuvatySitku(){
		String peremozhets = ZnajtyPeremozhtsya();
		if (peremozhets.equals(KHRESTYK)){
			statusGry = STATUS_PEREMOGA_X;
		} else if (peremozhets.equals(NULYK)){
			statusGry = STATUS_PEREMOGA_O;
		} else if (ChyVsiKlitynkyZapovneni()){
			statusGry = STATUS_NICHYYA;
		} else {
			statusGry = STATUS_GRA_TRYVAE;
		}
	}
	public static boolean ChyVsiKlitynkyZapovneni(){
		for (int ryad = 0; ryad < RYADKIV; ryad++){
			for (int stovp = 0; stovp < STOVPCHYKIV; stovp++){
				if (sitka[ryad][stovp] == POROZHNYA){
					return false;
				}
			}
		}
		return true;
	}
	public static String ZnajtyPeremozhtsya(){
		
		int iKilkistOdnakovykh;
		for(int ryad=0; ryad<RYADKIV; ryad++){
			iKilkistOdnakovykh=0;
			for(int stovp=0; stovp<STOVPCHYKIV; stovp++){
				if(sitka[ryad][0]!=POROZHNYA && sitka[ryad][0]==sitka[ryad][stovp]){
					iKilkistOdnakovykh++;
				}
			}
			if(iKilkistOdnakovykh==3){
				return sitka[ryad][0];
			}
		}
		// 3-в-стовпчик
		for(int stovp=0;stovp<STOVPCHYKIV; stovp++){
			iKilkistOdnakovykh=0;
			for(int ryad=0; ryad<RYADKIV; ryad++){
				if(sitka[0][stovp] != POROZHNYA && sitka[0][stovp] == sitka[ryad][stovp]){
					iKilkistOdnakovykh++;
				}
			}
			if(iKilkistOdnakovykh==3){
				return sitka[0][stovp];
			}
		}
		
		if (sitka[0][0]!=POROZHNYA && sitka[0][0]==sitka[1][1] && sitka[0][0]==sitka[2][2]){
			return sitka[0][0];
		}
		
		// 3-по-діагоналі-справа-наліво
		if (sitka[0][2] != POROZHNYA && sitka[1][1] == sitka[0][2] && sitka[2][0] == sitka[0][2]){
			return sitka[0][2];
		}
		return POROZHNYA;
		
	}
	public static void VyvestySitku(){
		for(int ryad=0; ryad<RYADKIV; ryad++) {
			for(int stovp=0; stovp<STOVPCHYKIV; stovp++){
				System.out.print(sitka[ryad][stovp]);
				if(stovp!=STOVPCHYKIV-1){
					System.out.print("|");
				}
			}
			System.out.println();
			if(ryad!=RYADKIV-1){
				System.out.println("------------");
			}
		}
		System.out.println();
	}
}
