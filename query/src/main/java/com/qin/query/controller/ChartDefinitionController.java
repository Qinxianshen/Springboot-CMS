package com.qin.query.controller;


import com.qin.query.domain.ChartDefinition;
import com.qin.query.domain.result.TableResult;
import com.qin.query.service.ChartDefinitionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/query/v1.0/chartDefinition")
@CrossOrigin(origins = "*")
public class ChartDefinitionController {

    @Resource
    public ChartDefinitionService chartDefinitionService;

    @GetMapping("/getTable")
    public Map<String,Object> findChartDefinition(){

        List<ChartDefinition> list = chartDefinitionService.findChartDefinition();
        TableResult tableResult = new TableResult();
        tableResult.setTotal(list.size());
        tableResult.setTableList(list);

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("data",tableResult);

        return map;
    }

}
