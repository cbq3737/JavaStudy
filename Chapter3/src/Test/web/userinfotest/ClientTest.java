package Test.web.userinfotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import Test.userinfo.UserInfo;
import Test.userinfo.userinfodao.UserInfoDao;
import Test.userinfo.userinfodao.mssqldao.MssqlDao;
import Test.userinfo.userinfodao.mysqldao.MysqlDao;
import Test.userinfo.userinfodao.oracledao.OracleDao;

public class ClientTest {

	public static void main(String[] args) throws IOException {
		
		UserInfo userinfo = new UserInfo();
		userinfo.setUserId("12345555");
		userinfo.setUserName("LEE");
		userinfo.setPassword("!@#$%%");
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop= new Properties();
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfoDao userinfodao = null;
		if(dbType.equals("MSSQL")) {
			userinfodao = new MssqlDao();
		}
		else if(dbType.equals("MYSSQL")) {
			userinfodao = new MysqlDao();
		}
		else if(dbType.equals("ORACLE")) {
			userinfodao = new OracleDao();
		}
		else {
			System.out.println("db error");
			return ;
		}
		userinfodao.deleteUserinfo(userinfo);
		userinfodao.insertUserinfo(userinfo);
		userinfodao.updateUserinfo(userinfo);
	}
}
