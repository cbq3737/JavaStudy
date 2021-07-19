package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userinfo) {
		System.out.println("Insert into MYSQL DB userID = "+userinfo.getUserId());	
	}//실제DB가 아니기에 넣었다는 표시만

	@Override
	public void deleteUserInfo(UserInfo userinfo) {
		System.out.println("Delete from MYSQL DB userID = "+userinfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userinfo) {
		System.out.println("Update into MYSQL DB userID = "+userinfo.getUserId());
	}

}
