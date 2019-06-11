package cn.com.cybertech.service;

import cn.com.cybertech.model.WebPermission;

import java.util.List;
import java.util.Set;

public interface WebPerimissionService {

    List<WebPermission> getPermissions(Integer roleId, List<Integer> types);

    Set<String> findPermissions(String userName);

    List<WebPermission> getPermsByRoleId(Integer roleId);

    void addOrEditPerm(WebPermission webPermission);

    void deletePerm(String ids);


}
