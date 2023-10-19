package testPhone2;

import java.util.Scanner;

import testPhone1.Phone1DAO;

public class Phone2DAO extends Phone1DAO {
	Scanner sc = new Scanner(System.in);
	Phone2DTO dto = new Phone2DTO();
	boolean check;

	public void init(Phone2DTO dto) {
		this.dto = dto;
	}

	public void phone_Initial2() {
		System.out.println("2세대 폰  ( " + dto.color + dto.model + ") 가 지급 되었습니다. (1세대 폰 모든 기능을 점검)");
		Phone2DTO dto = new Phone2DTO();
		init(dto);
		Phone();
		this.check = PowerOn(false);
		
		System.out.println(check);
		mainScreen();
//		if (dto.button.equals("On")) {
//			System.out.println("이니셜-2가 켜졌습니다.");
//			dto.isPower = true;
//		}
	}
//	
//	@Override
//	public void PowerOn(boolean isPower) {
//		System.out.println("모델명: "+dto.getModel()+"색상 :"+dto.getColor()+"전원:"+isPower);
//		if(isPower==false) {
//			System.out.println("전원이 켜집니다");
//			dto.isPower =true;
//		}
//	}

	public void mainScreen() {
		System.out.println("버튼을 눌러주세요 (dmb - \"dmb\"입력)");
		button();
	}

	public void dmbOff() {
		if (dto.button.equals("off") || dto.button.equals("OFF")) {
			System.out.println("dmb 를 종료합니다");
		}
	}

	public void button() {
		while (check) {
			dto.button = sc.nextLine();
			if (dto.button.equals("전원끄기")) {
				this.check = PowerOff(true);
			} else if (dto.button.equals("dmb")) {
				dmbTurn();
			}
		}
	}

	public void dmbTurn() {
		while (check) {
			if (dto.button.equals("dmb") || dto.button.equals("DMB")) {
				System.out.println("DMB가 켜집니다. 현재 채널 : 정보없음");
				dto.channel = "정보없음";
				dmbOff();
				dmbChannel();
				break;
			} else {
				System.out.println("유효한 값이 아닙니다.");
				button();
				continue;
			}
		}
	}

	
	
	
	public void dmbChannel() {
		String temp;
		System.out.println("DMB 채널을 입력해주세요");
		while (check) {
			try {
				button();
				if (dto.button.equals("off") || dto.button.equals("OFF")) {
					System.out.println("DMB가 종료됩니다.");
					mainScreen();
					break;
				}
				temp = dto.button;
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요");
				continue;
			}
			System.out.println("DMB방송의 채널을 변경합니다");
			System.out.println(dto.channel + "=>" + dto.button + "로 채널을 변경합니다 ");
			dto.channel = dto.button;

		}
	}
}
