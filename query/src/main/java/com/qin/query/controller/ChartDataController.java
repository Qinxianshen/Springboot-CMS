package com.qin.query.controller;


import com.qin.query.service.ChartDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/*
* 图表数据控制层
* */
@RestController
@RequestMapping("/api/query/v1.0/chartData")
@CrossOrigin(origins = "*")//添加跨域请求 解决前后端分离应用无法访问数据的问题
public class ChartDataController {

    @Autowired
    public ChartDataService chartDataService;

    @GetMapping("/getData")
    public Map<String,Object> getChartData(){
        return chartDataService.getChartData();
    }
}
