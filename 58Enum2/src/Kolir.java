
public enum Kolir {
	
	RED(255,0,0), GREEN(0,255,0), BLUE(0,0,255), YELLOU(255,255,0);
	// 1 RED, GREEN, BLUE, YELLOU;
	private int red;
	private int green;
	private int blue;
	
	// создаемо конструктор
	private Kolir(int r, int g, int b){// конструктор повинен бути в enum - private
		red = r; green = g; blue = b;
	}
	
	public String getRGB(){
		return String.format ("(%s,%s,%s)", red, green, blue);
	}
}
