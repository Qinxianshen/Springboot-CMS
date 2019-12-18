package com.qin.query.domain;


/* author:Qinzijing
*  date: 2019/12/18
*  description:数据源表
*/
public class Datasouce {
    /*  ID  */
    private Integer id;
    /*  数据源名 */
    private String datasouceName;
    /* 数据路类型 */
    private String datasouceType;
    /* 链路地址 */
    private String LinkedUrl;
    /* 数据库 */
    private String database;
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

    public String getDatasouceName() {
        return datasouceName;
    }

    public void setDatasouceName(String datasouceName) {
        this.datasouceName = datasouceName;
    }

    public String getDatasouceType() {
        return datasouceType;
    }

    public void setDatasouceType(String datasouceType) {
        this.datasouceType = datasouceType;
    }

    public String getLinkedUrl() {
        return LinkedUrl;
    }

    public void setLinkedUrl(String linkedUrl) {
        LinkedUrl = linkedUrl;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
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
