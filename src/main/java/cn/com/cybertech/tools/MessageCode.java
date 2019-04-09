package cn.com.cybertech.tools;

public class MessageCode {

    public static final int BASE_SUCC_CODE = 0;                             // 请求成功
    public static final int BASE_PARAMS_ERR_VALIDE = 911001;                // 请填写完整参数

    //应用
    public static final int APPINFO_ERR_SELECT = 10101; //未查到应用
    public static final int APPINFO_ERR_OPERATION = 10102; //添加或修改应用失败
    public static final int APPINFO_ERR_UNENABLE = 10103; //应用未通过审核
    //用户
    public static final int USERINFO_ERR_SELECT = 20101; //用户不存在
    public static final int USERINFO_DISABLE = 20102; //用户已被禁用
    public static final int USERINFO_ERR_PASSWORD = 20103; //密码错误
    public static final int USERINFO_ERR_LOGIN = 20104; //用户登陆失败
    public static final int USERINFO_ERR_ADD = 20105; //添加或编辑用户失败
    public static final int USERINFO_ERR_DEL = 20106; //删除用户失败
    //公司
    public static final int COMPANYINFO_ERR_SELECT = 30101; //未查到公司
    public static final int COMPANYINFO_ERR_OPERATION = 30102; //添加或修改公司失败
    public static final int COMPANYINFO_ERR_DELECT = 30103; //删除公司失败
}