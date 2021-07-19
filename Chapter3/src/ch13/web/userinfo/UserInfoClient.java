package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {
	//파일에서 읽어들여서 db타입을 판단.
	public static void main(String[] args) throws IOException {
		FileInputStream fiis = new FileInputStream("db.properties");
	
		Properties prop = new Properties();//키=밸류 등 쌍으로 되어있는애들을 pair로 읽어들일수있는 기능의 객체
		prop.load(fiis);//위에 스트림을 열어놨으므로 키,밸유로 되어있는 쌍으로 있는 값을 따로따로 읽어들여서  하나의 값을 주면 실질적으로 어떤 밸유가 들어있나를 리턴해줌.
		
		String dbType = prop.getProperty("DBTYPE");//키를 주었으므로 그에 해당하는 밸유를 리턴해준다.
		
		UserInfo userinfo = new UserInfo();
		userinfo.setUserId("12345");
		userinfo.setPassword("!@#$%");
		userinfo.setUserName("LEE");
		
		UserInfoDao userInfoDao = null;//처음에는 dao를 어떤 걸 쓴 것인지 안정해놧기에 null
		//db가 아직 어떤것인지 모르기에 interface타입으로 선언을 한다.
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}
		else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
		}
		else {
			System.out.println("db error");
			return;
		}
		userInfoDao.insertUserInfo(userinfo);
		userInfoDao.updateUserInfo(userinfo);
		userInfoDao.deleteUserInfo(userinfo);
		//만일 db가 추가가 된다. dao를 추가해주면된다.
	}
}
