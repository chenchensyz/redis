package cn.com.cybertech.controller.sys;

import cn.com.cybertech.config.redis.RedisTool;
import cn.com.cybertech.model.WebPermission;
import cn.com.cybertech.model.WebRole;
import cn.com.cybertech.model.WebUser;
import cn.com.cybertech.service.WebPerimissionService;
import cn.com.cybertech.service.WebRoleService;
import cn.com.cybertech.tools.CodeUtil;
import cn.com.cybertech.tools.MessageCode;
import cn.com.cybertech.tools.MessageCodeUtil;
import cn.com.cybertech.tools.RestResponse;
import cn.com.cybertech.tools.exception.ValueRuntimeException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/web/role")
public class WebRoleController {
    private static final Logger LOGGER = LoggerFactory.getLogger(WebRoleController.class);

    @Autowired
    private WebRoleService webRoleService;

    @Autowired
    private MessageCodeUtil messageCodeUtil;

    @Autowired
    private WebPerimissionService webPerimissionService;

    @Autowired
    private RedisTool redisTool;

    @RequestMapping("/list")
    public RestResponse queryWebRoleList(HttpServletRequest request, WebRole webRole) {
        int msgCode = MessageCode.BASE_SUCC_CODE;
        PageHelper.startPage(webRole.getPageNum(), webRole.getPageSize());
        List<WebRole> webRoleList = webRoleService.getRoleList(webRole);
        PageInfo<WebRole> webInfoPage = new PageInfo<>(webRoleList);
        return RestResponse.res(msgCode, messageCodeUtil.getMessage(msgCode)).setData(webRoleList)
                .setTotal(webInfoPage.getTotal()).setPage(webInfoPage.getLastPage());
    }

    @RequestMapping("/queryWebRoleTypeList")
    public RestResponse queryWebRoleTypeList(HttpServletRequest request) {
        String token = request.getHeader("token");
        WebUser webUser = redisTool.getUser(CodeUtil.REDIS_PREFIX + token);
        int msgCode = MessageCode.BASE_SUCC_CODE;
        List<WebRole> companyRoleList = webRoleService.getCompanyRoleList(webUser.getSource());
        return RestResponse.res(msgCode, messageCodeUtil.getMessage(msgCode)).setData(companyRoleList);
    }

    @RequestMapping("/addOrEdidRole")
    public RestResponse addOrEdidRole(WebRole webRole) {
        int msgCode = MessageCode.BASE_SUCC_CODE;
        try {
            webRoleService.addOrEdidRole(webRole);
        } catch (ValueRuntimeException e) {
            msgCode = (Integer) e.getValue();
        }
        return RestResponse.res(msgCode, messageCodeUtil.getMessage(msgCode));
    }

    //根据角色查询拥有的权限
    @RequestMapping(value = "/rolePerms", method = RequestMethod.GET)
    public RestResponse getRolePerms(Integer roleId) {
        int msgCode = MessageCode.BASE_SUCC_CODE;
        List<WebPermission> permissions = webPerimissionService.getPermsByRoleId(roleId);
        return RestResponse.res(msgCode, messageCodeUtil.getMessage(msgCode)).setData(permissions);
    }

    //删除角色
    @RequestMapping(value = "/deleteRole", method = RequestMethod.GET)
    public RestResponse deleteRole(Integer roleId) {
        int msgCode = MessageCode.BASE_SUCC_CODE;
        try {
            webRoleService.deleteRole(roleId);
        } catch (ValueRuntimeException e) {
            msgCode = (Integer) e.getValue();
        }
        return RestResponse.res(msgCode, messageCodeUtil.getMessage(msgCode));
    }
}
