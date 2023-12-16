                              Орератори і цикли
1 Інкремент/Декремент
import java.util.Scanner;
public class IncrementDecrement {
//	public static void main(String[] args) {
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
		morozyvo++;
		System.out.print("Нова кількість:");
		System.out.println(--morozyvo); // пре-денкремент
		System.out.println(morozyvo--); // пост-денкремент  
		System.out.println(morozyvo);
//-------------------------------------------------------------------------------
2 Оператор if
  public class OperatorIF {
  public static void main(String[] args) {
		int chislo = 10;
если	if (chislo >= 10){
то			System.out.println("Ваше число >= 10");	}
еще	    else{
то			System.out.println("Ваше число не >= 10"); }}}
//-------------------------------------------------------------------------------
3 Оператор if
public class OperatorIf_2 {	
//	public static void main(String [] args){
		int tsina_tavria = 10000;
		int tsina_audi = 50000;
		int tsina_ferrari = 200000;
		int zarplata = 500000;
			if (zarplata >= tsina_tavria) { // якщо (...), то {...}   
			System.out.println("Я можу купити Таврію");}
		else if (zarplata >= tsina_audi) {// якщо (...), то {...}
			System.out.println("Я можу купити Audi");}
		else if (zarplata >= tsina_ferrari) { // якщо (...), то {...}
			System.out.println("Я можу купити Ferrari");}
		else {// в будь-якому іншому випадку {...}
			System.out.println("Я буду їздити на автобусі");}}}
//-------------------------------------------------------------------------------
4 Умовні оператори
public class RelationalOperators {
//	public static void main(String[] args) {
		// >  : більше ніж          5>3
		// <  : менше ніж           7<15
		// == : дорівнює            2==2
		// != : не дорівнює         3!=5
		// >= : більше або дорівнює 4>=1
		// <= : менше або дорівнює  9<=9	
		int chislo = 7;
		// більше
		if (chislo>5){
			System.out.println("> : Число більше ніж 5");
		} else {
			System.out.println("> : Число НЕ більше ніж 5");}
		// менше
		if (chislo<11){
			System.out.println("< : Число менше ніж 11");
		} else {
			System.out.println("< : Число НЕ менше ніж 11");}
		// дорівнює
		if (chislo == 10){
			System.out.println("== : Число дорівнює 10");
		} else {
			System.out.println("== : Число НЕ дорівнює 10");}
		// НЕ дорівнює (оператор перевірки нерівності)
		// повертає TRUE (істину) якщо об`єкти неоднакові, і FALSE - якшо однакові
		if (chislo != 9){
			System.out.println("!= : Число НЕ дорівнює 9");
		} else {
			System.out.println("!= : Число  дорівнює 9");}	
		// більше/рівно
		if (chislo >= 8){
			System.out.println(">= : Число  більше-або-дорівнює 8");
		} else {
			System.out.println(">= : Число НЕ більше-або-дорівнює 8");}
		// менше/рівно
		if (chislo <= 20){
			System.out.println("<= : Число  менше-або-дорівнює 20");
		} else {
			System.out.println("<= : Число НЕ менше-або-дорівнює 20");}}}
//-------------------------------------------------------------------------------
5 Логічні оператори
public class LogichniOperatory {
	public static void main(String[] args) {
		int zoloto = 1, sriblo = 2, bronza = 1;
		System.out.println("Загальна кількість медалей:" + (zoloto+sriblo+bronza));
		// чи має наша збірна всі три види медалей (золото, срібло, бронза)
		if (zoloto > 0 && sriblo > 0 && bronza > 0){
			System.out.println("У вас є медалі всіх трьох типів");}
		// чи має наша збірна хоча б одну медаль
		if (zoloto > 0 || sriblo > 0 || bronza > 0){
			System.out.println("У вас як мінімум одна медаль");}}	}			
//------------------------------------------------------------------------------
6 Логічні оператори2
import java.util.Scanner;
public class LogichniOperatory2 {
	public static void main(String[] args) {
		System.out.println("Введіть свій вік: ");
		Scanner s = new Scanner (System.in);
		int vik = s.nextInt();
		if (vik > 120){
			System.out.println("Щось вам підозріло багато років");}}}
//------------------------------------------------------------------------------
7 Логічне виключення
public class LogichneVukluchenny {
public static void main(String[] args) {
		int a = 5, b = 10;
		if (a == 5 ^ b == 10){
			System.out.println("так");
		}else
		{System.out.println("ні");}
		{System.out.println(!(5 > 4));} } }
			// a && b - логічне "і" - обидва елементи повинні бути істиною
		// a & b -  логічне "і" - обидва елементи повинні бути істиною
		// a || b - логічне або - хоча б один елемент повинен бути істиною
		// a | b  - логічне або - хоча б один елемент повинен бути істиною
		// a ^ b  - логічне двійкове виключення
		//		(один з елементів має бути істиною, і один має бути брехнею
		// !a     - логічне НЕ, або ж "інверсія"
		//      (перетворює булеве значення справа від себе на протилежне)
//------------------------------------------------------------------------------
8 Операції зі змінної	
public class OperatsijiZiZminnymy {
public static void main(String[] args) {
		int iA = 2;
		int iB = 3;
		System.out.println(iA + iB);
		char cA = '2';
		char cB = '3';
		System.out.println(cA + cB);
		String sA = "2";
		String sB = "3";
		System.out.println(sA + sB);} }
//------------------------------------------------------------------------------
9 Введення від користувача
public class Vvedennya {
public static void main(String[] args) {
		System.out.println("Введіть рік свого народження");
		Scanner mijSkaner = new Scanner(System.in);
		int vik = 2023 - mijSkaner.nextInt();
		System.out.print("Ваш вік: ");
		System.out.print(vik);
		System.out.print(" років");	}}
//------------------------------------------------------------------------------
10 Змінні
public class Zminni {
public static void main(String[] args) {
		int zminna_X;
		zminna_X = 5;
		char zminna_C;
		zminna_C = 'ї';}}
//------------------------------------------------------------------------------
11 Operator Vubory Switch 
import java.util.Scanner;
public class OperatorVuborySwitch {
	public static void main(String[] args) {
		System.out.println("Введіть літеру");
		String litera = "";
		Scanner skan = new Scanner(System.in);
		litera = skan.nextLine();
		// 5 способ 
		switch (litera.toLowerCase()){
		case "а":
		case "е":
		case "є":
		case "и":
		case "і":
		case "ї":
		case "о":
		case "у":
		case "ю":
		case "я":
			System.out.println("це голосна");
			break;
		case "б":
		case "в":
		case "г":
		case "ґ":
		case "д":
		case "ж":
		case "з":
		case "й":
		case "к":
		case "л":
		case "м":
		case "н":
		case "п":
		case "р":
		case "с":
		case "т":
		case "ф":
		case "х":
		case "ц":
		case "ч":
		case "ш":
		case "щ":
		case "ь":
			System.out.println("це приголосна");
			break;
		default:
			System.out.println("Я не знаю що це за буква");
			break;}}}
//------------------------------------------------------------------------------
12 Operator While
import java.util.Scanner;
public class OperatorWhile {
	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		String slovo = "";
		while (slovo.equals("чай") != true){
			System.out.println("Хочу чай");
			slovo = skan.nextLine();}
		System.out.println("Дякую за чай!"); } }
		// 1 int chyslo = 0;
		// while (chyslo!=7){
			//System.out.println("Введіть/вгадайте число між 0 і 10");
			//chyslo = skan.nextInt();}
			//System.out.println("Ви вгадали, це число 7");
//------------------------------------------------------------------------------
13 Mij Metod	
public class MijMetod { // клас 
	public static void main(String[] args) // метод запуска програми
	{SkazatyPryvit(); }//  викликати метод	
	public static void SkazatyPryvit() {
		System.out.println("Привіт!"); 
		SkazatyJakSpravy(); }//  викликати метод
	public static void SkazatyJakSpravy() {// метод
		System.out.println("Як справи?"); } }// тело метода
//------------------------------------------------------------------------------
14 Метод параметри
import java.util.Scanner;
public class MetodParametry {
	public static void main(String[] args) {
		String mojeMisto = "Львів";
		double mojaVaga = 75.5;
		SkazhyPryvit("Ігор", mojeMisto, 25, mojaVaga);}
		// 2 String mojeImya = "Ігор";
		//String mojeMisto = "Львів";
		//SkazhyPryvit(mojeImya, mojeMisto);
		//1 Scanner mijSkan = new Scanner(System.in);
		//System.out.println("Введіть своє им'я");
		//String imya = mijSkan.nextLine();
		//System.out.println("Введіть своє misto");
		//String misto = mijSkan.nextLine();
		//SkazhyPryvit(imya, misto);
	public static void SkazhyPryvit(String imya, String misto, int vik, double vaga){
		System.out.println("Привіт, " + imya + " з міста " + misto + "; вік " + vik);
		System.out.println("Вага: " + vaga);}}
//------------------------------------------------------------------------------
15 Vkladenni Operatory
public class VkladenniOperatory {
	public static void main(String[] args) {
		int vik = 17;
		if (vik < 18){
			System.out.println("Ви неповнолітній/-а");
			switch (vik){
			case 17:
				System.out.println("Скоро повноліття");
				break;
			default:
				System.out.println("Повноліття не скоро");
				break;
			}if (vik <= 10){
				System.out.println("Ви дуже юний/-а");
			}else{
				System.out.println("Вам лишилось кілька років до повноліття");}
		}else{
			System.out.println("Ви повнолітній/-я");
			if (vik < 60){
				System.out.println("Вам менше ніж 60");
			}else{
				System.out.println("Вам за 60");}}}}
//------------------------------------------------------------------------------
16 Metod Return
public class MetodReturn {
	public static void main(String[] args) {
		int suma = Suma(5, 12); // метод сума
		System.out.println(suma);}	
	public static int Suma(int a, int b){
		int sumaChysel = a + b;
		return sumaChysel;}}
		// 2 Nichogo();
		// String tekst = PovernuTekst();
		// int chyslo = PovernuChyclo(); 
		// 1 String rezultat = SkazhyPryvit("Віктор");
		// System.out.println(rezultat);} // вивід результату на екран
	// метод, який ми викликаємо
	//public static String SkazhyPryvit(String imya){
		//String text = "Привіт, " + imya; //System.out.println("Привіт, " + imya);
		//return text;}
	// 2 public static void Nichogo(){
	//	System.out.println("Я не повертаю нічого");}
	//public static String PovernuTekst(){
		// або можно так return "якийсь текст";
		//String tekst = "якийсь текст";
		//return tekst;}
	//public static int PovernuChyclo(){
	//	return 5;}
//------------------------------------------------------------------------------
17 Umovnyi Operator
import java.util.Scanner;
public class UmovnyiOperator {
	public static void main(String[] args) {
		// 1-1000 - професори і викладачі
		// 1001 - 55000 - студенти
		// 55000 - ... - обслуговучий персонал
		System.out.println("Введіть свій номер:");
		Scanner skan = new Scanner(System.in);
		int id = skan.nextInt();
		System.out.println("Ціна для вас: " + ((id > 1000 && id < 55000) ? 2.0 : 3.0));}}
		// 2 double tsina = (id > 1000 && id < 55000) ? 2.0 : 3.0;
		// 1 double tsina = 0.0;
		//if (id > 1000 && id < 55000){
			//tsina = 2.0;
		//}else{
			//tsina = 3.0;}
		//System.out.println("Ціна для вас: " + tsina);
//------------------------------------------------------------------------------
18 Type Convert
public class TypeConvert {
	public static void main(String[] args) {
		// будь-який з простих типів можна конвертувати в String і назад
		double d = Double.parseDouble("12312341.123");
		int i = Integer.parseInt("1293781");
		String sd = String.valueOf(d);
		String si = String.valueOf(i);
		System.out.println(d + " : " + sd);
		System.out.println(i + " : " + si);}}
		// 7 int i = 5;
		//double d = i; // неявне (автоматичне) перетворення
		//double d1 = 5.5;
		//int i1 = (int) d1; // явне (неатоматичне, або ж ручне) з допомогою коду
		// 6 double d = 5.5;
		//int i = (int) d;
		//System.out.println(i);
		// 5 int i = 5;
		// double d = i;
		// System.out.println(d);
		// 4 float f = 2345345331298378912739.40f; // 32bit
		// int i = (int) f; // 32bit
		// System.out.println(i);
		// 3 double d = 2345345331298378912739.40; // double 64bit
		//short s = (short) d; // short 16bit
		//System.out.println(s);
		// 2 System.out.println("byte: " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
		//System.out.println("short: " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);
		//System.out.println("int: " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
		//System.out.println("long: " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
		//System.out.println("-------------------------------");
		//System.out.println("float: " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);
		//System.out.println("double: " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);
		// 1 boolean b = true;
		// char c = 'a';
		// byte by = 127;
		// short s = 32767;
		// int i = 2147483647; // 32 bit
		// long l = 9223372036854775807l;
		// float f = 3.4028235*(10^38);
		// double d = 1.797631348623157*(10^308);
//------------------------------------------------------------------------------		
19 Serednie Aryfm
import java.util.Scanner;
public class SerednieAryfm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String vvedennya = "0.0";
		double suma = 0, serednie = 0, chyslo = 0;
		int kilkistChysel = 0;
		while(vvedennya.equals(".") != true){
			chyslo = Double.parseDouble(vvedennya);
			suma = suma + chyslo;
			System.out.println("Введіть число або [.] щоб зупинитись: ");
			vvedennya = scan.nextLine();
			kilkistChysel++;}	
		serednie = suma/--kilkistChysel;
		System.out.println("Середнє з " + kilkistChysel + " чисел: " + serednie);
//------------------------------------------------------------------------------		
20 do While
public class doWhile {
	public static void main(String[] args) {
		int chyslo = 1;
/*делать*/  do {// виконати
			System.out.println(chyslo);
			chyslo++;}
/*пока*/	while(chyslo<=7);}}}
	// 1 так пишется цикл while
		//while (умова==істина) // допоки
			// виконати якісь дії/операції
//------------------------------------------------------------------------------
21 Цикл For
public class ForLoop {
	public static void main(String[] args) {
		//for (/*початок*/;/*кінець*/;/*крок-інкремент*/)
/*для*/	for (int lichylka = 1 ;lichylka <= 10;lichylka++) {
			System.out.println(lichylka); 	}}}
//------------------------------------------------------------------------------
22 For Loop Decrement
import java.util.Scanner;
public class ForLoopDecrement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть слово: ");
		String slovo = scan.nextLine();
		// п р и в і т
		// 0 1 2 3 4 5 6
		for (int i = slovo.length()-1; i>=0; i--){
			System.out.print(slovo.substring(i, i +1));}}}
		// 2 for (int i=10; i>=0; i--){
		//	System.out.println(i);}
		// 1 for (int i=0; i<=10; i++){
			//System.out.println(i);}
//------------------------------------------------------------------------------
23 Matematyka
public class Matematyka {
	public static void main(String[] args) {
		//System.out.println(Math.sqrt(25));
		// square root - вычисление квадратного корня
		System.out.println(Math.abs(9));}}
//------------------------------------------------------------------------------
24 Masyv
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
		System.out.println(chysla[2]);}}
		// 1 int[] chisla;
		//chisla = new int[3];
		// виділити об'єм в памяті, достатнього розміру,
		// щоб записати 3 значення типу int
//------------------------------------------------------------------------------
25 String Array
public class StringArray {
	public static void main(String[] args) {
		//String test = null;
		String[] chysla = new String [3]; // 
		chysla[1]="Привіт";
		for (int i=0; i<chysla.length; i++){
			System.out.println(chysla[i]);}}}
		// 4 char[] chysla = new char[3]; // 
		// for (int i=0; i<chysla.length; i++){
		// 	System.out.println(chysla[i]);}
		// 3 double[] chysla = new double[3]; // 
		//chysla[1] = 3.14;
		//for (int i=0; i<chysla.length; i++){
		//	System.out.println(chysla[i]);}
		// 2 int[] chysla = new int[3]; // [0] [0]  [0]
		// for (int i=0; i<chysla.length; i++){
			// System.out.println(chysla[i]);}
		// 1 litniMisyatsi[0] = "Червень"; litniMisyatsi[1] = "Липень"; litniMisyatsi[2] = "Серпень";
		// String[] frukty = {"Яблуко", "Чорниця", "Кавун"}; 
		// for (int i=0; i<frukty.length; i++){
			// System.out.println(frukty[i]);}
//------------------------------------------------------------------------------
26 For Loop Enhanced
public class ForLoopEnhanced {
	public static void main(String[] args) {
		String[] mista = {"Кіїв", "Львів", "Сімферополь", "Харків"}; 
		for (String tseMisto: mista){
			System.out.println(tseMisto); } }}
		// 2 int[] chysla = {123, 65, 179, 34566, 9000}; 
		// for (int i: chysla){
			//System.out.println(i);}
		//  1            [0]  [1]  [2]  [3]    [4]
		//int[] chysla = {123, 65, 179, 34566, 9000}; // ініціалізація = присвоєня початкового значення змінної
		//for (int i =0; i<chysla.length; i++){
		//	System.out.println(chysla[i]);}
//------------------------------------------------------------------------------
27 MultidimensionalArray
public class MultidimensionalArray {
	public static void main(String[] args) {
		int[][] lotto = {
				{2, 53, 32, 17, 43, 5},
				{44, 12, 39, 1, 6, 50},
				{17, 9, 8, 44, 19, 21},
				{54, 3, 29, 20, 4, 11},
				{26, 54, 4, 37, 41, 8},
				{12, 8, 47, 5, 23, 27},
				{51, 30, 9, 20, 42, 15} };
		for (int i=0; i<lotto.length; i++){
			int sumaChyselRozigrashu = 0;
			for (int chyslo: lotto[i]){
				sumaChyselRozigrashu=sumaChyselRozigrashu+chyslo;}
			System.out.println("Сума чисел розіграшу №" + i + ": " + sumaChyselRozigrashu + "; \n");
			System.out.println("Середнє розіграшу №" + i + ": " + sumaChyselRozigrashu/lotto[i].length);}}}
		// 5 String[][] slova = new String[3][]; 
		// slova[1] = new String[] {"вода", "молоко", "сік", "", "мінералка"};
		/* тоб то перший елемент цього двовимірного масиву буде пустий
		*другий елемент буде теж масивом и матиме 5 елементів
		*третий елемент теж буде порожним*/
		// 4 String[][] dvovymirnyi = {
		// /*0*/{"футбол", "Африка"},
		// /*1*/{"комп'ютер", "мова", "сніг", "стіна"},
		// /*2*/{"java", "сонце", "редиска"}};
		// for (int ryad = 0; ryad<dvovymirnyi.length; ryad++){
		// 	for (int stovp = 0; stovp<dvovymirnyi[ryad].length; stovp++){
		//		System.out.println(dvovymirnyi[ryad][stovp]);}}}
		// 3 String[][] dvovymirnyi = {
		//	/*0*/{"", ""},
		//	/*1*/{"", "", "", "", ""},
		//	/*2*/{"", "", "редиска"}};
		//System.out.println(dvovymirnyi[2][2]);}
		// 2 int[][] dvovymirnyi = {
		//		/*0*/{1, 25},
		//		/*1*/{2, 67, 777, 81, 999},
		//		/*2*/{5, 33, 2} };
		//System.out.println(dvovymirnyi[1][2]);}
		// 1              [0]   [1]  [2]
		//int [] chysla = {123, 1231, 3253}; // одновимірний масив, 1-dimensional array
		//chysla[1] = 1;
		//System.out.println(chysla[1]);}
//------------------------------------------------------------------------------		
28 ArraySort
import java.util.Arrays;
public class ArraySort { // 27 марта 2023 год
	public static void main(String[] args) { 
		int[] array = {3,1,9,5,4};
		// 1 SortAndPrint(array);
		BubbleSort(array);}
	public static void SortAndPrint(int[] m){  // метод який сортував масив з допомогою класу java.util.Arrays
		Arrays.sort(m); // сортировка масива
		System.out.println(Arrays.toString(m)); // выводит отсортированный масив
		for (int i=m.length-1; i>=0; i--) // метод який виводит масив задом на перед 
			System.out.print(m[i] + " "); 
		System.out.println("");}
	public static void BubbleSort(int[] m) { // метод для демонстрації і не для використання
		int povtoriv = 0;
		boolean vidbulasZamina = true;
/*пока*/while(vidbulasZamina) {
			vidbulasZamina = false;
/*для*/	for(int i=0; i<m.length-1-povtoriv; i++) {
/*якщо*/	if(m[i]>m[i+1]) {
				int tmp = m[i];
				m[i] = m[i+1];
				m[i+1] = tmp;
				vidbulasZamina = true;}}
			povtoriv++;}
		for(int i: m)
			System.out.print(i + " ");}}
//------------------------------------------------------------------------------
29 VariableParamMethod
public class VariableParamMethod {
	public static void main(String[] args) {
		System.out.println(VyrakhuvatySerednie(1,2,3,4,5));
		System.out.println(VyrakhuvatySerednie(15,34,46,75,89,1,45,23,11));}
	public static double VyrakhuvatySerednie(int...chysla){ // можно использовать три точки, если не знаете сколько будет переменных
	int suma=0; 
	for(int i: chysla)
		suma+=i; // або suma=suma+1
	return (double)suma/(double)chysla.length; }} // конвертація на лету
//------------------------------------------------------------------------------
30 Chast2GlobalVariables { 
	// ми нєможемо написати код за межами класу
	public class Chast2GlobalVariables { // 30 марта 2023 года
		public static final double vidsotok=10; 
		// final - означает неизменная переменная, и пишется перед типом переменной
		public static void main(String[] args) {
			double chyslo = 25;
			System.out.println(chyslo/100*vidsotok);}}
//------------------------------------------------------------------------------
31 Chast2
import java.util.Scanner;
public class Chast2 {
	public static void main(String[] args) {
	boolean yePomylka = false;	
	do {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Введить чисельник: ");
			int c1 = s.nextInt();
			System.out.println("Введіть знаменник: ");
			int c2 = s.nextInt();
			System.out.println("Результат: " + c1/c2);
			yePomylka = false;}
/*ловить*/  catch (Exception pomilka) {
			yePomylka = true;
			System.out.println("Такого робити не можна :( " + pomilka.getMessage());}}
	while (yePomylka); }}// або yePomylka==true
//------------------------------------------------------------------------------
32 


