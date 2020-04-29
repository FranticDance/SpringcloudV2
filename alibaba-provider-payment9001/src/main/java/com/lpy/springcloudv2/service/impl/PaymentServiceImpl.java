package com.lpy.springcloudv2.service.impl;

import com.lpy.springcloudv2.dao.PaymentDao;
import com.lpy.springcloudv2.entities.Payment;
import com.lpy.springcloudv2.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lpy
 * @version 1.0
 * @date 2020/4/26 0:46
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
