package com.xdx97.pay.service.impl;

import com.xdx97.pay.entitys.AlipayBean;
import com.xdx97.pay.service.PayService;
import com.xdx97.pay.utils.Alipay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alipay.api.AlipayApiException;

@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private Alipay alipay;


    @Override
    public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
        return alipay.pay(alipayBean);
    }
}
