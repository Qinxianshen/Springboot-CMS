package com.qin.query.service;

import com.qin.query.domain.Datasouce;
import org.springframework.stereotype.Service;

import java.util.List;

/* author:Qinzijing
*  date: 2019/12/18
*  description:数据源服务 业务层
*/
@Service
public interface DatasouceService {
    /* 查询 */
    List<Datasouce> findDatasouce();
}
