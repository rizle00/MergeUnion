package testPhone3;

import testPhone2.Phone2DTO;

public class Phone3DTO extends Phone2DTO {


	public String internetSpeed;
	public int channel;
	public int onf;
	
	
	public Phone3DTO (String color, String model, String condition, String internetSpeed) {
		super(color, model, condition);
		this.internetSpeed = internetSpeed;
		
	}
	
	
	
	
}
