package com.shy.springboot.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 石皓岩
 * @create 2020-03-12 8:19
 * 描述：
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class ResultMsg {
    private Integer code;
    private String msg;
    private Object data;


    public static ResultMsg ok() {
        return new ResultMsg(0, "数据返回成功", null);
    }

    public static ResultMsg ok(Object data) {
        return new ResultMsg(0, "数据返回成功", data);
    }

    public static ResultMsg ok(String msg, Object data) {
        return new ResultMsg(0, msg, data);
    }

    public static ResultMsg error() {
        return new ResultMsg(1, "数据返回失败", null);
    }

    public static ResultMsg error(Object data) {
        return new ResultMsg(1, "数据返回失败", data);
    }

    public static ResultMsg error(String msg, Object data) {
        return new ResultMsg(1, msg, data);
    }

    public static ResultMsg build(boolean ok) {
        if (!ok) {
            return new ResultMsg(1, "数据更新失败", null);
        } else {
            return new ResultMsg(0, "数据更新成功", null);
        }

    }

    public static ResultMsg build() {
        return build(true);
    }


}
