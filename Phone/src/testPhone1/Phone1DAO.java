package testPhone1;

public class Phone1DAO {
	Phone1DTO dto = new Phone1DTO();
	
	public void PowerOn(boolean isPower) {
		if(isPower==false) {
			System.out.println("������ �մϴ�");
			dto.isPower =true;
		}
	}
	
	public void PowerOff(boolean isPower) {
		if(isPower==true) {
			System.out.println("������ �մϴ�");
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
