package com.smart.mybatis;

import com.smart.mybatis.entity.Order;
import com.smart.mybatis.mapper.OrderMapper;
import com.smart.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @Author: Ram
 * @Since: 2020.10.27 11:05
 */
public class TestMain {

    public static void main(String[] args) {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(
                TestMain.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );

        SqlSession sqlSession = sessionFactory.openSession(true);

        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        Order order = orderMapper.selectOrderByNo(1234);

        System.out.println(order);
    }
}
