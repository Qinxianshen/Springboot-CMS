package com.qin.query.service.Impl;


import com.qin.query.dao.QueryDefinationMapper;
import com.qin.query.domain.QueryDefination;
import com.qin.query.service.QueryDefinationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/* author:Qinzijing
*  date: 2019/12/18
*  description:查询定义
*/
@Service
public class QueryDefinationServiceImpl implements QueryDefinationService {

    @Resource
    private QueryDefinationMapper queryDefinationMapper;

    @Override
    public List<QueryDefination> findQueryDefination() {
        return queryDefinationMapper.findQueryDefination();
    }
}
