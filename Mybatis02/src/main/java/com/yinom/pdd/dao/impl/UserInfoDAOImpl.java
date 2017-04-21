package com.yinom.pdd.dao.impl;

import com.yinom.pdd.dao.UserInfoDAO;
import com.yinom.pdd.domain.UserInfo;
import com.yinom.pdd.utils.DBFactory;
import org.apache.ibatis.session.SqlSession;


public class UserInfoDAOImpl implements UserInfoDAO {

    public int addUser(UserInfo user) {

        // ����
        SqlSession session = null;

        try {
            // ��ȡSqlSession
            session = DBFactory.getSession();

            int count = session.insert("com.bfe.domain.UserInfo.adduser", user);

            //�ύ����
            session.commit();
            return count;

        } catch (Exception e) {
            e.printStackTrace();
            //�ع�����
            session.rollback();
        } finally {
            //�ر�����
            session.close();
        }

        return 0;
    }

}
