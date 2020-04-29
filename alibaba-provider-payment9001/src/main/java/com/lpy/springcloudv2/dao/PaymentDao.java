package com.lpy.springcloudv2.dao;

import com.lpy.springcloudv2.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lpy
 * @version 1.0
 * @date 2020/4/26 0:32
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
