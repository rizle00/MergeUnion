package testPhone3;

import testPhone1.Phone1DAO;
import testPhone2.Phone2DAO;

public class Phone3DAO extends Phone2DAO {
	
	Phone1DAO  phone1dao  = new Phone1DAO();
	Phone3DTO phone3dto = new Phone3DTO(null, null, null, null);
	
	
	
	public int internetOn() {
		System.out.println("인터넷 ON");
		return 1;
	}
	
	public void inernetOff() {
		System.out.println("인터넷 OFF");
	}
	
	
	public void webtoonApp() {
		if(internetOn() == 1 ) {
		System.out.println("웹툰 ON");
		}else {
			System.out.println("웹툰 OFF");
		}
	}
	
	
	
	
	
}
