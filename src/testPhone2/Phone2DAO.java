package testPhone2;

import java.util.Scanner;

import testPhone1.Phone1DAO;

public class Phone2DAO extends Phone1DAO {
	Scanner sc = new Scanner(System.in);
	Phone2DTO dto = new Phone2DTO();

	public void init(Phone2DTO dto) {
		this.dto = dto;
	}

	public void phone_Initial2() {//시작
		System.out.println("2세대 폰  ( " + dto.color + dto.model +") 가 지급 되었습니다. (1세대 폰 모든 기능을 점검)");
		Phone2DTO dto = new Phone2DTO();
		setPhone();
		init(dto);
		Phone();
		PowerOn(dto.isPower);
		this.dto.condition = dto.isPower;
		
		System.out.println(dto.condition);
		mainScreen();
//		if (dto.button.equals("On")) {
//			System.out.println("이니셜-2가 켜졌습니다.");
//			dto.isPower = true;
//		}
	}
//	
	@Override
	public boolean PowerOn(boolean isPower) {
		
		if(isPower==false) {
			System.out.println("전원이 켜집니다");
			dto.isPower =true;
			return isPower;
		}return isPower;
	}
	
	@Override
	public boolean PowerOff(boolean isPower) {
		if(isPower==true) {
			System.out.println("전원이 꺼집니다");
			dto.isPower =false;
			return isPower;
		} return isPower;
	}

	public void mainScreen() {
		System.out.println("버튼을 눌러주세요 (dmb - \"dmb\"입력)");
		button();// 전원끄기 or dmb 
	}

	public void dmbOff() {
		if (dto.button.equals("off") || dto.button.equals("OFF")) {
			System.out.println("dmb 를 종료합니다");
		}
	}

	public void button() {
		while (dto.condition) {
			dto.button = sc.nextLine();
			if (dto.button.equals("전원끄기")) {
				PowerOff(dto.isPower);
			} else if (dto.button.equals("dmb")) {
				dmbTurn();
			}else {
				
			}
		}
	}

	public void dmbTurn() {
		while (dto.condition) {
			if (dto.button.equals("dmb") || dto.button.equals("DMB")) {
				System.out.println("DMB가 켜집니다. 현재 채널 : 정보없음");
				dto.channel = "정보없음";
				dmbOff();
				dmbChannel();
				break;
			} else {
				try {
					int temp = Integer.parseInt(dto.button);
					
				}
				catch (NumberFormatException e) {
					System.out.println("유효한 값이 아닙니다.");
					button();
					continue;	
				}
				
			}
		}
	}

	
	
	
	public void dmbChannel() {
		String temp;
		System.out.println("DMB 채널을 입력해주세요");
		while (dto.condition) {
			try {
				temp = sc.nextLine();
				if (temp.equals("off") || temp.equals("OFF")) {
					System.out.println("DMB가 종료됩니다.");
					mainScreen();
					break;
				}
				int temp2 = Integer.parseInt(temp);
				
				
				
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요");
				continue;
			}
			System.out.println("DMB방송의 채널을 변경합니다");
			System.out.println(dto.channel + "=>" + temp + "로 채널을 변경합니다 ");
			dto.channel = temp;

		}
	}
}
