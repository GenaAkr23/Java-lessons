
public class Zoopark {

	public static void main(String[] args) {
		Dynozavr d = new Dynozavr();
		System.out.printf("Динозавр каже %s%n", d.privit());
		Korova k = new Korova();
		System.out.printf("Корова каже %s%n", k.privit());
		Metelyk m = new Metelyk();
		System.out.printf("Метелик каже %s%n", m.dobrogoDnya());
	}

}
