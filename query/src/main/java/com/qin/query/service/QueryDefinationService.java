package com.qin.query.service;


import com.qin.query.domain.QueryDefination;
import org.springframework.stereotype.Service;

import java.util.List;

/* author:Qinzijing
*  date: 2019/12/18
*  description:查询定义管理
*/
@Service
public interface QueryDefinationService {

    /* 查询 */
    List<QueryDefination> findQueryDefination();
}
