
public class ZooMasyv {

	public static void main(String[] args) {
		GrupaTvaryn gp = new GrupaTvaryn(4);
		//Pingvin p1 = new Pingvin("Шкіпер");
		//gp.Dodaty(p1);
		gp.Dodaty(new Pingvin("Шкіпер"));
		gp.Dodaty(new Pingvin("Ковальський"));
		gp.Dodaty(new Pingvin("Ріко"));
		gp.Dodaty(new Pingvin("Рядовий"));
		
		GrupaTvaryn gn = new GrupaTvaryn(2);
		gn.Dodaty(new Nosorig("Рогатий Носоріг"));
		gn.Dodaty(new Nosorig("Цікавий Носоріг"));
		gn.Dodaty(new Nosorig("Рядовий Носоріг"));
	}

}
