package com.qin.query.service.Impl;

import com.qin.query.dao.ChartDataMapper;
import com.qin.query.domain.ChartData;
import com.qin.query.service.ChartDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ChartDataServiceImpl implements ChartDataService {

    @Resource
    private ChartDataMapper chartDataMapper;

    @Override
    public Map<String, Object> getChartData() {

        List<ChartData> chartDataList = chartDataMapper.getChartData();
        List<String> xTime = new ArrayList<>();
        List<String> data1 = new ArrayList<>();
        List<String> data2 = new ArrayList<>();
        List<String> data3 = new ArrayList<>();
        List<String> data4 = new ArrayList<>();
        for (ChartData chartData : chartDataList){
            xTime.add(chartData.getTime());
            data1.add(chartData.getData1());
            data2.add(chartData.getData2());
            data3.add(chartData.getData3());
            data4.add(chartData.getData4());
        }
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("xTime",xTime);
        map.put("size",chartDataList.size());
        map.put("data1",data1);
        map.put("data2",data2);
        map.put("data3",data3);
        map.put("data4",data4);
        return map;
    }
}
