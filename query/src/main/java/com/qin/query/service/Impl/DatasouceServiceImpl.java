package com.qin.query.service.Impl;


import com.qin.query.dao.DatasouceMapper;
import com.qin.query.domain.Datasouce;
import com.qin.query.service.DatasouceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/* author:Qinzijing
*  date: 2019/12/18
*  description:数据源服务 业务层
*/
@Service
public class DatasouceServiceImpl implements DatasouceService {

    @Autowired
    private DatasouceMapper datasouceMapper;

    @Override
    public List<Datasouce> findDatasouce() {
        return datasouceMapper.findDatasouce();
    }
}
