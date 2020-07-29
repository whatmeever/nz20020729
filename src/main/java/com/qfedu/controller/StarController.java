package com.qfedu.controller;

import com.qfedu.pojo.Star;
import com.qfedu.service.IStarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StarController {

    @Resource
    private IStarService starService;

    @GetMapping("/Stars")
    @ResponseBody
    public List<Star> getAllStars(){
        return starService.getAllStars();
    }

    @GetMapping("/StarsLayUI")
    @ResponseBody
    public Map<String, Object> getLayUIData(){

        List<Star> list = starService.getAllStars();

        Map<String, Object> map = new HashMap<>();

        map.put("code", 0);
//        map.put("msg", "");
        map.put("count", list.size());
        map.put("data", list);

        return map;
    }

    @GetMapping("/saveStar")
    public String saveStar(){
        return "saveStar.jsp";
    }

    @GetMapping("/table2")
    public String table2(){
        return "table2.jsp";
    }

    @GetMapping("/{path}")
    public String getPath(@PathVariable String path){
        return path + ".jsp";
    }

    @GetMapping("/StarPage")
    @ResponseBody
    public List<Star> getStarsByPage(@RequestParam( defaultValue = "1") int cp, @RequestParam(defaultValue = "5") int ps){
        return starService.getStarsByPage(cp, ps);
    }
}

