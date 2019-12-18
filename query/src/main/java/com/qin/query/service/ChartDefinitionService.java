package com.qin.query.service;


import com.qin.query.domain.ChartDefinition;
import org.springframework.stereotype.Service;

import java.util.List;


/* author:Qinzijing
*  date: 2019/12/18
*  description:图表定义服务
*/
@Service
public interface ChartDefinitionService {
    /*
     * 查询
     * */
    List<ChartDefinition> findChartDefinition();
}
