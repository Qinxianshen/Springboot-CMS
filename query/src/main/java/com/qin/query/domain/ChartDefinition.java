package com.qin.query.domain;


/* author:Qinzijing
*  date: 2019/12/18
*  description:图表定义类
*/
public class ChartDefinition {
    //ID
    private Integer id;
    //图表定义名称
    private String name;
    //图表类型
    private String chartType;
    //统计维度类型
    private String dimisionType;
    //统计频度
    private String frequence;
    //数据源名称
    private String datasouceName;
    //状态
    private Integer status;
    //创建时间
    private String createTime;
    //更新时间
    private String updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChartType() {
        return chartType;
    }

    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    public String getDimisionType() {
        return dimisionType;
    }

    public void setDimisionType(String dimisionType) {
        this.dimisionType = dimisionType;
    }

    public String getFrequence() {
        return frequence;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
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
