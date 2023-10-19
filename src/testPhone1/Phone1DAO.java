package testPhone1;

import java.util.Scanner;

public class Phone1DAO {
	Phone1DTO dto = new Phone1DTO();
	Scanner sc = new Scanner(System.in);
	public void setPhone() {
		System.out.println("모델명과 색상을 선택하세요");
		
		dto.setModel(sc.nextLine());
		dto.setColor(sc.nextLine()); 
	}
	
	public void Phone() {
		PowerOn(dto.isPower);
		while(dto.isPower) {
			call(dto.isCall);
			PowerOff(dto.isPower);
		}
	}
	public void PowerOn(boolean isPower) {
		
		System.out.println("모델명: "+dto.getModel()+"색상 :"+dto.getColor());
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
	public void call(boolean isCall) {
		while(true) {
		if(isCall==false) {
			System.out.println("전화가 옵니다");
			dto.isCall = true;
			answer();
			
			transmit();
			receive();
			hangUp();
			break;
		} else if(isCall == true) {
			System.out.println("통화중입니다");
		}
		}
	}
	public void answer() {
		
			System.out.println("전화를 받습니다");
		
	}
	
	public void hangUp() {
			System.out.println("통화를 종료합니다");
			dto.isCall = false;
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
