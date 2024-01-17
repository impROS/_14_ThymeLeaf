package com.example._14_thymeleaf;

import java.util.List;

public class AjaxResponseBody {
    String message;
    List<User> result;

    public AjaxResponseBody() {
    }

    public AjaxResponseBody(String message, List<User> result) {
        this.message = message;
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public  void setResult(List<User> result) {
        this.result = result;
    }

    public List<User> getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "AjaxResponseBody{" +
                "message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
