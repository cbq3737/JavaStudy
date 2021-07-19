package Test.userinfo.userinfodao.mysqldao;

import Test.userinfo.UserInfo;
import Test.userinfo.userinfodao.UserInfoDao;

public class MysqlDao implements UserInfoDao {

	@Override
	public void insertUserinfo(UserInfo userinfo) {
		System.out.println("MYSQL insert "+userinfo.getUserId());
		
	}

	@Override
	public void deleteUserinfo(UserInfo userinfo) {
		System.out.println("MYSQL delete "+userinfo.getUserId());
		
	}

	@Override
	public void updateUserinfo(UserInfo userinfo) {
		System.out.println("MYSQL update "+userinfo.getUserId());
		
	}

}
