package com.qin.query.dao;

/* author:Qinzijing
*  date: 2019/12/18
*  description:用户信息查询的数据层接口
*/

import com.qin.query.domain.Role;
import com.qin.query.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    User loadUserByUsername(String username);
    List<Role> getUserRolesByUid(Integer id);
}
