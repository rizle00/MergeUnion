package testPhone3;

import java.util.Scanner;

import testPhone1.Phone1DAO;
import testPhone2.Phone2DAO;

public class Phone3DAO extends Phone2DAO {
	
	Scanner sc = new Scanner(System.in);
	

	Phone3DTO dto = new Phone3DTO();
//	Phone3DTO phone3dto = new Phone3DTO(null, null, null, null);
	
	
	public int internetOn(int onf) {
		System.out.println("인터넷 연결하시겠습니까? 1.On");
		dto.opt = Integer.parseInt(sc.nextLine());
			if(onf == 1) {
				System.out.println("인터넷 ON");
				return 1;
			}else {
				System.out.println("인터넷 OFF");
			}
			return 2; //int라서 아무값이나 넣어줌.
	}
	
	
	public void inernetOff() {
		System.out.println("인터넷 OFF");
	}
	
	
	
	public void webtoonApp() {
		System.out.println("웹툰앱을 실행하시겠습니까? 1.On 2.Off");
		if(internetOn(dto.onf) == 1 ) {
		System.out.println("웹툰 ON");
		}else {
			System.out.println("웹툰 OFF");
		}
	}
	
	
	
	
	
}
