
public class SmartphoneSho {

	public static void main(String[] args) {
		Smartphone i7 = new Smartphone("iPhone", true, 100.5);
		// i7.setBrendName("iPhone");
		System.out.println(i7.getBrendName()); // "-не вказано-"
		System.out.println(i7.getTsina());
		System.out.println(i7.isNew()); // true 

	}

}
