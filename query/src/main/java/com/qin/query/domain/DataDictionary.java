package com.qin.query.domain;


/* author:Qinzijing
*  date: 2019/12/18
*  description:数据字典
*/
public class DataDictionary {

    /* ID */
    private Integer id;
    /* 数据字典编号 */
    private String dictionaryNum;
    /* 数据字典名称 */
    private String dictionaryName;
    /* 数据字典类型 */
    private String dictionaryType;
    /* 父节点编号 */
    private String fatherNode;
    /* 键值SQL */
    private String sqlKey;
    /* 数据源 */
    private Integer datasouce;
    /* 状态 */
    private Integer status;
    /* 创建时间 */
    private String createTime;
    /* 更新时间 */
    private String updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDictionaryNum() {
        return dictionaryNum;
    }

    public void setDictionaryNum(String dictionaryNum) {
        this.dictionaryNum = dictionaryNum;
    }

    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }

    public String getDictionaryType() {
        return dictionaryType;
    }

    public void setDictionaryType(String dictionaryType) {
        this.dictionaryType = dictionaryType;
    }

    public String getFatherNode() {
        return fatherNode;
    }

    public void setFatherNode(String fatherNode) {
        this.fatherNode = fatherNode;
    }

    public String getSqlKey() {
        return sqlKey;
    }

    public void setSqlKey(String sqlKey) {
        this.sqlKey = sqlKey;
    }

    public Integer getDatasouce() {
        return datasouce;
    }

    public void setDatasouce(Integer datasouce) {
        this.datasouce = datasouce;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
