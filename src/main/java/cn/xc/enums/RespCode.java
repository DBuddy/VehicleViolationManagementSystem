package cn.xc.enums;

/**
 * @version V1.0
 * @Description: 响应码
 * @Author XiongCheng
 * @Date 2018/1/28 13:54.
 */
public enum RespCode {
    SUCCESS(0, "请求成功"),
    WARN(-1, "网络异常，请稍后重试");

    private int code;
    private String msg;

    RespCode(int code, String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}