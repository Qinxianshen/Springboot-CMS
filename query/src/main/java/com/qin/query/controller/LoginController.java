package com.qin.query.controller;


import com.qin.query.domain.QueryDefination;
import com.qin.query.domain.User;
import com.qin.query.domain.result.TableResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
*
* 暂时的登录
* */
@RestController
@RequestMapping("/api/query/v1.0/login")
@CrossOrigin(origins = "*")
public class LoginController {

    @PostMapping("/login")
    public Map<String,Object> login(User user){

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);

        Map<String,Object> data = new HashMap<>();
        data.put("success",true);
        data.put("msg","登录成功");
        data.put("token","admin-token");
        data.put("user","admin");
        map.put("data",data);

        return map;
    }

    @GetMapping("/getInfo")
    public Map<String,Object> getInfo(){
        String[] arrays = {
                "Home",
                "Dashbord",
                "Driver",
                "Driver-index",
                "Permission",
                "PageUser",
                "Table",
                "BaseTable",
                "ComplexTable",
                "Icons",
                "Icons-index",
                "Components",
                "Sldie-yz",
                "Upload",
                "Carousel",
                "Echarts",
                "Sldie-chart",
                "Dynamic-chart",
                "Map-chart",
                "Excel",
                "Excel-out",
                "Excel-in",
                "Mutiheader-out",
                "Error",
                "Page404",
                "Github",
                "NavTest",
                "Nav1",
                "Nav2",
                "Nav2-1",
                "Nav2-2",
                "Nav2-2-1",
                "Nav2-2-2",
                "*404"
        };

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        Map<String,Object> data = new HashMap<>();
        data.put("name","admin");
        data.put("roles",arrays);
        data.put("introduce","这是一个介绍");
        map.put("data",data);

        Map<String,Object> _res = new HashMap<>();
        _res.put("status","401");

        Map<String,Object> msg = new HashMap<>();
        msg.put("msg","未授权");
        _res.put("data",msg);
        map.put("_res",_res);
        return map;
    }
}
