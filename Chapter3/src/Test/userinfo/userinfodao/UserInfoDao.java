package Test.userinfo.userinfodao;

import Test.userinfo.UserInfo;

public interface UserInfoDao {
	
	public void insertUserinfo(UserInfo userinfo);
	public void deleteUserinfo(UserInfo userinfo);
	public void updateUserinfo(UserInfo userinfo);
}
