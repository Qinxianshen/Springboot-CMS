package com.qin.query.dao;


import com.qin.query.domain.QueryDefination;
import org.springframework.stereotype.Repository;

import java.util.List;

/* author:Qinzijing
*  date: 2019/12/18
*  description:查询定义
*/
@Repository
public interface QueryDefinationMapper {

    /* 查询 */
    List<QueryDefination> findQueryDefination();

}
