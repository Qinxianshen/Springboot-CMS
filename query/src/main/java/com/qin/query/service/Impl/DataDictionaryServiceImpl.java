package com.qin.query.service.Impl;


/* author:Qinzijing
*  date: 2019/12/18
*  description:数据字典
*/

import com.qin.query.dao.DataDictionaryMapper;
import com.qin.query.domain.DataDictionary;
import com.qin.query.service.DataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* author:Qinzijing
*  date: 2019/12/18
*  description:数据字典
*/
@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {

    @Autowired
    private DataDictionaryMapper dataDictionaryMapper;

    @Override
    public List<DataDictionary> findDataDictionary() {
        return dataDictionaryMapper.findDataDictionary();
    }
}
