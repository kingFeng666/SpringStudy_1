package com.shangguan.dao;

import com.shangguan.service.someService;

/**
 * @ClassName: someServiceImpl
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 09月 10 0:34
 * @Version 1.0
 */
public class someServiceImpl implements someService {
    @Override
    public void say() {
        System.out.println("你好Spring控制反转...............");
    }
}
