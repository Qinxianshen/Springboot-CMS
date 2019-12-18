package com.qin.query.domain;

/* author:Qinzijing
*  date: 2019/12/18
*  description:查询定义
*/
public class QueryDefination {

    /* ID */
    private Integer id;
    /* 定义名称 */
    private String definationName;
    /* 查询编号 */
    private String queryNum;
    /* 数据源名称 */
    private String datasouceName;
    /* 是否分页 */
    private Integer status;
    /* 分页大小 */
    private Integer pageSize;
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

    public String getDefinationName() {
        return definationName;
    }

    public void setDefinationName(String definationName) {
        this.definationName = definationName;
    }

    public String getQueryNum() {
        return queryNum;
    }

    public void setQueryNum(String queryNum) {
        this.queryNum = queryNum;
    }

    public String getDatasouceName() {
        return datasouceName;
    }

    public void setDatasouceName(String datasouceName) {
        this.datasouceName = datasouceName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
