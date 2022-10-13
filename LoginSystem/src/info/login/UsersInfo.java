package info.login;
import java.util.HashMap;


public class UsersInfo {
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	UsersInfo(){
		logininfo.put("yamada","123456");
		logininfo.put("satou","123456");
		logininfo.put("hanayama","123456");
	}
	
	 protected HashMap getLoginInfo(){
		return logininfo;
	}
}



