package com.qin.query.domain.result;


import java.util.List;

/* author:Qinzijing
*  date: 2019/12/18
*  description:表格的通用返回格式
*/
public class TableResult {

    /* 表格字段长度 */
    private Integer total;

    private List tableList;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List getTableList() {
        return tableList;
    }

    public void setTableList(List tableList) {
        this.tableList = tableList;
    }
}
