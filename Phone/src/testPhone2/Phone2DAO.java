package testPhone2;

import java.util.Scanner;

public class Phone2DAO {
	Scanner sc = new Scanner(System.in);
	Phone2DTO dto = new Phone2DTO();
	
	public void dmbTurnOff() {
		if()
	}
	
//	public void phonePowerOff() {
//		if( 핸드폰 전원꺼져있을때 ) {
//		System.out.println("핸드폰 전원을 켜주세요");
//		}
//	}

	public void dmbTurn() { // 디엠비 키기
		while (true) {
			System.out.println("\"dmb\"라고 입력하시면 dmb가 켜집니다.");
			String temp = sc.nextLine();
			if (temp.equals("DMB") || temp.equals("dmb")) {
				System.out.println("DMB가 켜집니다.");
				dmbChannel();
				break;
			} else {
				System.out.println("유효한 값이 아닙니다.");
			}
		}
	}

	public void dmbChannel() {
		System.out.println("DMB채널을 입력해주세요");
		while (true) {
			try {
				dto.button =sc.nextLine();
				break;
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요!");
			}
		} dto.channel = temp;
		System.out.println(dto.channel + "번 채널로 변경합니다.");
	}
	
	
	
	
	
	
}
