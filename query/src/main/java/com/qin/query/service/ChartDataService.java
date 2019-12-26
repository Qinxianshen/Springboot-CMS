package com.qin.query.service;


import org.springframework.stereotype.Service;

import java.util.Map;

/*
* 图表服务
* */
@Service
public interface ChartDataService {
    /*
    * 查询
    * */
    Map<String,Object> getChartData();
}
