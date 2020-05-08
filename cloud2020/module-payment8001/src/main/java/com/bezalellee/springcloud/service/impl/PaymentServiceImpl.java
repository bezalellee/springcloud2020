package com.bezalellee.springcloud.service.impl;

import com.bezalellee.springcloud.dao.PaymentDao;
import com.bezalellee.springcloud.entities.Payment;
import com.bezalellee.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
