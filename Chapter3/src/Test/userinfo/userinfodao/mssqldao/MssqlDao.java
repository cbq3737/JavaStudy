package Test.userinfo.userinfodao.mssqldao;

import Test.userinfo.UserInfo;
import Test.userinfo.userinfodao.UserInfoDao;


public class MssqlDao implements UserInfoDao{

	@Override
	public void insertUserinfo(UserInfo userinfo) {
		System.out.println("MSSQL insert "+userinfo.getUserId());
	}

	@Override
	public void deleteUserinfo(UserInfo userinfo) {
		System.out.println("MSSQL delete"+userinfo.getUserId());
	}

	@Override
	public void updateUserinfo(UserInfo userinfo) {
		System.out.println("MSSQL update"+userinfo.getUserId());		
	}

}
