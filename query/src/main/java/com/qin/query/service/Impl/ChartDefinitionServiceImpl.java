package com.qin.query.service.Impl;

import com.qin.query.dao.ChartDefinitionMapper;
import com.qin.query.domain.ChartDefinition;
import com.qin.query.service.ChartDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/* author:Qinzijing
*  date: 2019/12/18
*  description:图表定义 实现
*/
@Service
public class ChartDefinitionServiceImpl implements ChartDefinitionService {

    @Autowired
    private ChartDefinitionMapper chartDefinitionMapper;

    /*
    * 查询
    * */
    @Override
    public List<ChartDefinition> findChartDefinition() {
        return chartDefinitionMapper.findChartDefinition();
    }
}
