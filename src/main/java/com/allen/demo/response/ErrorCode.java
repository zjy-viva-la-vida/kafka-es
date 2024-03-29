package com.allen.demo.response;

/**
 * 错误代码枚举
 *
 * @author qisong.li@bitmain.com
 * @version 1.0.0
 * @since 2018/11/23
 */
public enum ErrorCode {

    /**
     * 请求成功
     */
    RESULT_SUCCESS(0, "请求成功"),

    /**
     * 业务处理失败
     */
    BUSINESS_FAIL(1, "业务处理失败"),

    /**
     * 残余任务删除成功直接返回码
     */
    RESULT_DELETE_SUCCESS(4, "请求删除任务成功"),


    // 系统级错误代码
    /**
     * 系统错误
     */
    SYSTEM_ERROR(100001, "系统错误"),
    /**
     * 服务暂停
     */
    SERVICE_UNAVAILABLE(10002, "服务暂停"),
    /**
     * 远程服务错误
     */
    REMOTE_SERVICE_ERROR(10003, "远程服务错误"),
    /**
     * IP限制不能请求该资源
     */
    IP_LIMIT(10004, "IP限制不能请求该资源"),
    /**
     * 该资源需要拥有授权
     */
    PERMISSION_DENIED(10005, "该资源需要拥有授权"),
    /**
     * 缺少必选参数,请参考API文档
     */
    MISSING_REQUIRED_ARGUMENTS(10006, "缺少必选参数,请参考API文档"),
    /**
     * 非法的参数
     */
    INVALID_ARGUMENTS(10007, "非法的参数"),
    /**
     * 任务过多，系统繁忙
     */
    SYSTEM_BUSY(10008, "任务过多，系统繁忙"),
    /**
     * RPC错误
     */
    RPC_ERROR(10009, "RPC错误"),
    /**
     * 非法的参数
     */
    ILLEGAL_REQUEST(10010, "非法请求"),
    /**
     * 不合法的用户
     */
    INVALID_USER(10011, "不合法的用户"),
    /**
     * 消息处理异常
     */
    MESSAGE_ERROR(10012, "消息处理异常"),

    REF_EXISTS(10013, "存在引用");

    private Integer code;

    private String msg;

    ErrorCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 通过code返回对应的错误信息
     *
     * @param code code
     * @return
     */
    public static String getMsg(Integer code) {
        for (ErrorCode apiCodeEnum : ErrorCode.values()) {
            if (code.equals(apiCodeEnum.getCode())) {
                return apiCodeEnum.getMsg();
            }
        }
        return BUSINESS_FAIL.getMsg();
    }
}
