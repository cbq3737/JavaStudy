package Test.userinfo.userinfodao.oracledao;

import Test.userinfo.UserInfo;
import Test.userinfo.userinfodao.UserInfoDao;

public class OracleDao implements UserInfoDao{

	@Override
	public void insertUserinfo(UserInfo userinfo) {
		System.out.println("ORACLE insert "+userinfo.getUserId());
	}

	@Override
	public void deleteUserinfo(UserInfo userinfo) {
		System.out.println("ORACLE delete "+userinfo.getUserId());
	}

	@Override
	public void updateUserinfo(UserInfo userinfo) {
		System.out.println("ORACLE update "+userinfo.getUserId());
	}
	
}
