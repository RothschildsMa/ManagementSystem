package info.login;

public class Main {
	
	public static void main(String[] args){
		UsersInfo usersInfo = new UsersInfo();
		LoginPage loginPage = new LoginPage(usersInfo.getLoginInfo());

	
	}

}