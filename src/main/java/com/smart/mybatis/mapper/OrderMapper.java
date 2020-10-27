package com.smart.mybatis.mapper;

import com.smart.mybatis.entity.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Ram
 * @Since: 2020.10.27 10:24
 */
public interface OrderMapper {
    /**
     * 根据订单号查询
     * @param no 订单号
     * @return 订单对象
     */
    Order selectOrderByNo(@Param("orderNo") int no);
}
