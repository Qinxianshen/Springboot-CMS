package com.qin.query.controller;


import com.qin.query.domain.QueryDefination;
import com.qin.query.domain.result.TableResult;
import com.qin.query.service.QueryDefinationService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* author:Qinzijing
*  date: 2019/12/18
*  description:查询定义
*/
@RestController
@RequestMapping("/api/query/v1.0/QueryDefination")
@CrossOrigin(origins = "*")
public class QueryDefinationController {

    @Resource
    public QueryDefinationService queryDefinationService;

    @GetMapping("/getTable")
    public Map<String,Object> findQueryDefination(){
        List<QueryDefination> list = queryDefinationService.findQueryDefination();
        TableResult result = new TableResult();
        result.setTableList(list);
        result.setTotal(list.size());

        Map<String,Object> map = new HashMap<>();

        map.put("code",0);
        map.put("data",result);

        return map;
    }


}
