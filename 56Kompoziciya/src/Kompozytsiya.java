
public class Kompozytsiya {

	public static void main(String[] args) {
		Data dn = new Data(1,1,2001);
		Client c = new Client("Педро", dn);
		
		System.out.printf("%s", c);
	}

}
