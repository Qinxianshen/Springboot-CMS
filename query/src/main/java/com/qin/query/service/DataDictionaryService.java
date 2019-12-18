package com.qin.query.service;


import com.qin.query.domain.DataDictionary;
import org.springframework.stereotype.Service;

import java.util.List;

/* author:Qinzijing
*  date: 2019/12/18
*  description:数据字典服务
*/
@Service
public interface DataDictionaryService {
    /*
     * 查询
     * */
    List<DataDictionary> findDataDictionary();
}
