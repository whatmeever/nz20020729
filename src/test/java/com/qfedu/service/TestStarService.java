package com.qfedu.service;

import com.github.pagehelper.PageHelper;
import com.qfedu.dao.IStarDao;
import com.qfedu.pojo.Star;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestStarService {

    @Resource
    private IStarDao starDao;

    @Test
    public void test(){
        for (Star s : starDao.getAllStars()) {
            System.out.println(s);
        }
    }

    @Test
    public void testPage(){
        PageHelper.startPage(1, 2);

        for (Star allStar : starDao.getAllStars()) {
            System.out.println(allStar);
        }
    }
}
