package com.qin.query.dao;


import com.qin.query.domain.DataDictionary;
import org.springframework.stereotype.Repository;

import java.util.List;

/* author:Qinzijing
*  date: 2019/12/18
*  description:数据字典
*/
@Repository
public interface DataDictionaryMapper {

    /*
    * 查询
    * */
    List<DataDictionary> findDataDictionary();

}
