package testPhone3;

import testPhone2.Phone2Main;

public class Phone3Main extends Phone2Main {


	public static void main(String[] args) {
		Phone3DAO phone3dao = new Phone3DAO();
		phone3dao.PowerOn(true);
		System.out.println("인터넷 연결하시겠습니까? 1.On 2.Off");
		int i = Integer.parseInt(sc.nextline());
		phone3dao.internetOn();
		
		
		
		
		
}
}