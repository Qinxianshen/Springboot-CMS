package com.qin.query.dao;


import com.qin.query.domain.ChartDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;


/* author:Qinzijing
*  date: 2019/12/18
*  description:图表定义
*/
@Repository
public interface ChartDefinitionMapper {
    /*
    * 查询
    * */
    List<ChartDefinition> findChartDefinition();
}
