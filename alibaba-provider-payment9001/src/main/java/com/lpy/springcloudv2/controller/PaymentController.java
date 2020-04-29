package com.lpy.springcloudv2.controller;

import com.lpy.springcloudv2.common.OperationResult;
import com.lpy.springcloudv2.entities.CommonResult;
import com.lpy.springcloudv2.entities.Payment;
import com.lpy.springcloudv2.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lpy
 * @version 1.0
 * @date 2020/4/26 0:48
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果:" + payment);
        if (result > 0) {
            return new CommonResult(OperationResult.SUCCESS.getCode(), OperationResult.SUCCESS.getMessage());
        } else {
            return new CommonResult(OperationResult.FAIL.getCode(), OperationResult.FAIL.getMessage());
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果:" + payment);
        if (payment != null) {
            return new CommonResult(OperationResult.SUCCESS.getCode(), OperationResult.SUCCESS.getMessage(), payment);
        } else {
            return new CommonResult(OperationResult.FAIL.getCode(), OperationResult.FAIL.getMessage(), null);
        }
    }


}
