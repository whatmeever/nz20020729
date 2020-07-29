package com.qfedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.qfedu.dao.IStarDao;
import com.qfedu.pojo.Star;
import com.qfedu.service.IStarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StarServiceImpl implements IStarService {

    @Resource
    private IStarDao starDao;

    @Override
    public List<Star> getAllStars() {
        return starDao.getAllStars();
    }

    @Override
    public List<Star> getStarsByPage(int cp, int ps) {
        PageHelper.startPage(cp,  ps);

        return starDao.getAllStars();
    }
}
