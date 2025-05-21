package com.github.yescco2d71828.transaction.service;

import com.github.yescco2d71828.transaction.aspect.Transactional;
import com.github.yescco2d71828.transaction.dao.FinanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinanceService {

    @Autowired
    FinanceDao financeDao;

    @Transactional
    public void transfer(Long source, Long target, int money) {
        financeDao.subtractMoney(source, money);
        int i = 1 / 0;
        financeDao.addMoney(target, money);
    }
}
