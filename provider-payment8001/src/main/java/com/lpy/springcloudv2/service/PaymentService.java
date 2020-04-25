package com.lpy.springcloudv2.service;

import com.lpy.springcloudv2.entities.Payment;

/**
 * @author lpy
 * @version 1.0
 * @date 2020/4/26 0:45
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById( Long id);
}
