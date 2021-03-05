package com.yzg.springboot.service.impl;

import com.yzg.springboot.entity.CategorySort;
import com.yzg.springboot.service.IRefelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class RefelectServiceImpl implements IRefelectService {

    @Autowired
    private ApplicationContext context;

    @Override
    public void testAbility() throws Exception {
        long start = System.currentTimeMillis();
        Class<?> cls = Class.forName("com.yzg.springboot.entity.CategorySort");
        CategorySort categorySort = (CategorySort)cls.newInstance();
        System.out.println(categorySort);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    @Override
    public void testAbility1() throws Exception {
        long start = System.currentTimeMillis();
        Class<?> cls = Class.forName("com.yzg.springboot.entity.CategorySort");
        CategorySort categorySort = (CategorySort)context.getBean(cls);
        System.out.println(categorySort);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
