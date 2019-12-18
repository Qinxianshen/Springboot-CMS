package com.qin.query.dao;


import com.qin.query.domain.Datasouce;
import org.springframework.stereotype.Repository;

import java.util.List;


/* author:Qinzijing
*  date: 2019/12/18
*  description:数据源 数据层
*/
@Repository
public interface DatasouceMapper {

    /* 查询 */
    List<Datasouce> findDatasouce();
}
