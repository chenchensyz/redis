package cn.com.cybertech.dao;

import cn.com.cybertech.dao.common.BaseDao;
import cn.com.cybertech.model.WebRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebRoleMapper{

    int insertWebRole(WebRole webRole);

    int updateWebRole(WebRole webRole);

    int deleteRoleById(Integer roleId);

    List<WebRole> getRoleList(WebRole webRole);

    List<WebRole> getCompanyRoleList(String roleType);

    int deleteRolePerm(Integer roleId);

    int addRolePerm(WebRole webRole);

    WebRole getWebRoleByCode(String code);
}