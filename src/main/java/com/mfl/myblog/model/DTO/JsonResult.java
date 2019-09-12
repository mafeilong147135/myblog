package com.mfl.myblog.model.DTO;

public class JsonResult {

    private String status;

    private String message;

    private Object data;

    public JsonResult(String status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public JsonResult() {
        super();
    }

    public JsonResult success() {
        return new JsonResult("1", "操作成功", null);
    }

    public JsonResult success(Object data) {
        return new JsonResult("1", "操作成功", data);
    }

    public JsonResult fail() {
        return new JsonResult("1", "操作失败", null);
    }

    public JsonResult fail(String massage) {
        return new JsonResult("1", massage, null);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
