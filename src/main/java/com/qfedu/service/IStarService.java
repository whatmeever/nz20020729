package com.qfedu.service;

import com.qfedu.pojo.Star;

import java.util.List;

public interface IStarService {

    List<Star> getAllStars();

    List<Star> getStarsByPage(int cp, int ps);
}
