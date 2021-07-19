package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {
	//이것만 봐라.
	public void insertUserInfo(UserInfo userinfo);
	public void deleteUserInfo(UserInfo userinfo);
	public void updateUserInfo(UserInfo userinfo); 
}
