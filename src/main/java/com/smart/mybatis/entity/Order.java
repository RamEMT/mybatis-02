package com.smart.mybatis.entity;

import java.util.Date;

/**
 * @author Ram
 */
public class Order {
    /**
     *
     */
    private Integer orderId;

    /**
     * 订单号
     */
    private Integer orderNo;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 状态码 0表示未支付 1表示支付
     */
    private Integer status;

    private User user;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderNo=" + orderNo +
                ", createDate=" + createDate +
                ", uid=" + uid +
                ", status=" + status +
                ", user=" + user +
                '}';
    }
}

