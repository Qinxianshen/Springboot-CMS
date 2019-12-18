package com.qin.query.controller;


import com.qin.query.domain.Datasouce;
import com.qin.query.domain.result.TableResult;
import com.qin.query.service.DatasouceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* author:Qinzijing
*  date: 2019/12/18
*  description:数据源服务控制层
*/
@RestController
@RequestMapping("/api/query/v1.0/datasouce")
public class DatasouceController {

    @Resource
    public DatasouceService datasouceService;

    @GetMapping("/getTable")
    public Map<String,Object> findDatasouce(){
        List<Datasouce> list = datasouceService.findDatasouce();
        TableResult tableResult = new TableResult();
        tableResult.setTotal(list.size());
        tableResult.setTableList(list);

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("data",tableResult);
        return  map;
    }


}
