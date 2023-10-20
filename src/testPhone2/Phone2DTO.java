package testPhone2;

import testPhone1.Phone1DTO;

public class Phone2DTO extends Phone1DTO{
	String button , model = "이니셜-2", color = "검정" ; 
	String channel, condition;
	public void name(String color, String model) {
		this.setColor(color);
		this.setModel(model);
		super.isPower=  true;

	}
}
