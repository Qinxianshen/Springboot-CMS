package com.qin.query.dao;


import com.qin.query.domain.ChartData;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
* 图表数据层
* */
@Repository
public interface ChartDataMapper {
    /*
    * 查询数据
    * */
    List<ChartData> getChartData();
}
