package logic;

import java.util.List;

import entity.LoginTest;
import service.LoginTestService;

public class loginTestLogic {

	public static void main(String args[]){

		LoginTestService loginTestService = new LoginTestService();

		List<LoginTest> loginTestList = loginTestService.selectAll();

		//ログインテストの1件目のレコードを取得
		LoginTest loginTest = loginTestList.get(0);

		System.out.print(loginTest.getUserNemae());

	}

}
