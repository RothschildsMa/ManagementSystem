package info.login;
import java.util.HashMap;


public class UsersInfo {
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	UsersInfo(){
		logininfo.put("山田","yamada");
		logininfo.put("佐藤","satou");
		logininfo.put("花山","hanayama");
	}

}
