package com.qin.query.domain;


/* author:Qinzijing
*  date: 2019/12/18
*  description:角色实体类
*/

public class Role {
    /* 角色id */
    private Integer role_id;
    /* 角色名 */
    private String role_name;
    /* 角色名描述 */
    private String nameZh;

    public Role(Integer role_id, String role_name, String nameZh) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.nameZh = nameZh;
    }
    public Role(String name) {
        this.role_name = name;
    }

    public Integer getRoleId() {
        return role_id;
    }

    public void setRoleId(Integer roleId) {
        this.role_id = roleId;
    }

    public String getName() {
        return role_name;
    }

    public void setName(String name) {
        this.role_name = name;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }
}
