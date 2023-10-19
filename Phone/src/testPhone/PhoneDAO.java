package testPhone;

import testPhone1.Phone1DTO;

public class PhoneDAO {
Phone1DTO dto = new Phone1DTO();
	
	public void PowerOn(boolean isPower) {
		if(isPower==false) {
			System.out.println("전원이 켜집니다");
			dto.isPower =true;
		}
	}
	
	public void PowerOff(boolean isPower) {
		if(isPower==true) {
			System.out.println("전원이 꺼집니다");
			dto.isPower =false;
		}
	}
	
	public void answer() {
		
	}
	
	public void hangUp() {
		
	}
	
	public void transmit() {
		
	}
	
	public void receive() {
		
	}
}
