package testPhone2;

import testPhone1.Phone1DTO;

public class Phone2DTO extends Phone1DTO{
	String button;
	String channel;
	String condition;
	public void name(String color, String model, String condition) {
		this.setColor(color);
		this.setModel(model);
		this.condition = condition;
	}
}
