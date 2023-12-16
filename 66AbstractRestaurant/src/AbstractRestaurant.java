
public class AbstractRestaurant {

	public static void main(String[] args) {
		
		Client c = new Client("Котигорошко");
	//	Strava s = new Strava();
		Strava s = new NogaDinozavra(SposibPrygotuvannya.GryL);
		c.Jisty(s);
	}

}
