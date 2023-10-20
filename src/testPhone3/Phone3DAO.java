package testPhone3;

import java.util.Scanner;

import testPhone1.Phone1DAO;
import testPhone2.Phone2DAO;

public class Phone3DAO extends Phone2DAO {
	
	Scanner sc = new Scanner(System.in);
	
	
	
	Phone1DAO  phone1dao  = new Phone1DAO();
	Phone3DTO phone3dto = new Phone3DTO(null, null, null, null);
	
	
	public int internetOn(int onf) {
		phone1dao.PowerOn(true);
		System.out.println("인터넷 연결하시겠습니까? 1.On");
		int opt = Integer.parseInt(sc.nextLine());
			if(opt == 1) {
				System.out.println("인터넷 ON");
				return 1;
			}else {
				System.out.println("인터넷 OFF");
			}
			return opt;
	}
	
	public void inernetOff() {
		System.out.println("인터넷 OFF");
	}
	
	
	public void webtoonApp() {
		System.out.println("웹툰앱을 실행하시겠습니까? 1.On 2.Off");
		if(internetOn(phone3dto.onf) == 1 ) {
		System.out.println("웹툰 ON");
		}else {
			System.out.println("웹툰 OFF");
		}
	}
	
	
	
	
	
}
