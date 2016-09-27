package me.amc.colorapi;

public enum Colors {

	White(0), 
	Orange(1), 
	Magneta(2), 
	LightBlue(3), 
	Yellow(4), 
	Lime(5), 
	Pink(6), 
	Gray(7), 
	LightGray(8), 
	Cyan(9), 
	Purple(10), 
	Blue(11), 
	Brown(12), 
	Green(13), 
	Red(14), 
	Black(15);

	private final int id;
	private static final HashMap<String, Colors> colorsMap = new HashMap<>();

	Colors(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}
	
	static {
		for(Colors c : Colors.values()) {
			colorsMap.put(c.toString(), c);
		}
	}
	
	public static Colors getByName(String name) {
		if(colorsMap.containsKey(name)) {
			return colorsMap.get(name);
		} else {
			return White;
		}
	}

}
