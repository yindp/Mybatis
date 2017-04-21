package com.yinom.pdd.dao;


import com.yinom.pdd.domain.UserInfo;

public interface UserInfoDAO {

	/**
	 * ����û���Ϣ
	 * @param user
	 * @return
	 */
	public int addUser(UserInfo user);
	
}
