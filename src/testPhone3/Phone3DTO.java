package testPhone3;

import testPhone2.Phone2DTO;

public class Phone3DTO extends Phone2DTO {

	public String internetSpeed;
	
	
	public Phone3DTO (String color, String model, String condition, String internetSpeed) {
		
		super(color, model, condition);
		this.internetSpeed = internetSpeed;
	}
	
	
	
	
}
