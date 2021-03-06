package cn.com.cybertech.dao;

import cn.com.cybertech.dao.common.BaseDao;
import cn.com.cybertech.model.WebPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebPermissionMapper {

    List<WebPermission> getPermByRoleId(@Param("roleId") Integer roleId, @Param("types") List<Integer> types);

    List<WebPermission> getPermsByRoleId(Integer roleId);

    int insertWebPermission(WebPermission webPermission);

    int updateWebPermission(WebPermission webPermission);

    int getMaxOrderNum(@Param("parentId") Integer parentId, @Param("type") Integer type);

    int deleteWebPermInIds(@Param("ids") List<Integer> ids);

    List<WebPermission> getPermList(@Param("source") String source);

}