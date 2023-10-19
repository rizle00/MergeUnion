package testPhone2;

import java.util.Scanner;

import testPhone1.Phone1DAO;

public class Phone2DAO extends Phone1DAO{
	Scanner sc = new Scanner(System.in);
	Phone2DTO dto = new Phone2DTO();

	public void dmbOff() {
		if(dto.button.equals("dmb") || dto.button.equals("DMB")) {
			System.out.println("dmb 를 종료합니다");
		}
	}
	
	
	public void checkCall() {
//		if()
	}
//	public void phonePowerOff() {
//		if (폰 전원 꺼져있을때) {
//			System.out.println("전원이 꺼져있어 DMB방송을 켤수가없습니다.");
//		}
//	}
	public void dmbTurn() {
		while(true) {
			System.out.println("\"dmb\"라고 입력하시면 dmb가 켜집니다.");
			dto.button = sc.nextLine();
			if(dto.button.equals("dmb") || dto.button.equals("DMB")) {
				System.out.println("DMB가 켜집니다. 현재 채널 : 정보없음");
				dto.channel = dto.button;
				break;
			}else {
				System.out.println("유효한 값이 아닙니다.");
			}
		}
	}
	
	
	public void dmbChannel() {
		int temp;
		System.out.println("DMB 채널을 입력해주세요");
		while(true) {
			try {
				dto.button = sc.nextLine();
				temp = Integer.parseInt(dto.button);
			}catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요");
			}
		}
	}
	
	
	
	
}
