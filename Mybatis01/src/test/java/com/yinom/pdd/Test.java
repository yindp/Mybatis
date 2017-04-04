package com.yinom.pdd;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yinom.pdd.domain.UserInfo;

public class Test {

    public static void main(String[] args) throws Exception {


        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader, "mysql");


        SqlSession session = ssf.openSession();

        UserInfo user = (UserInfo) session.selectOne("com.yinom.pdd.domain.UserInfo.queryUser", 3);

        System.out.println(user);
    }

}
