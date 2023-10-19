package testPhone1;

import java.util.Scanner;

public class Phone1DAO {
	Phone1DTO dto = new Phone1DTO();
	Scanner sc = new Scanner(System.in);
	public void setPhone(String model, String color) {
		dto.model = model;
		dto.color = color;
	}
	
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
	public void call(boolean isPower, boolean isCall) {
		if(isPower==true && isCall==false) {
			System.out.println("전화가 옵니다");
			dto.isCall = true;
		} else if(isPower==true && isCall == true) {
			System.out.println("통화중입니다");
		}
	}
	public void answer(boolean isCall) {
		if(isCall==true) {
			System.out.println("전화를 받습니다");
		}
	}
	
	public void hangUp(boolean isCall) {
		if(isCall==true) {
			System.out.println("통화를 종료합니다");
			dto.isCall = false;
		}
	}
	
	public void transmit() {
		System.out.println("통화합니다");
		sc.nextLine();
	}
	
	public void receive() {
		System.out.println("상대방이 말합니다");
		sc.nextLine();
	}
}
