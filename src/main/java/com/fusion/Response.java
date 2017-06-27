package com.fusion;

public class Response {
private boolean status;
private String message;
private String errorCode;
private Object payload;

public Response() { }

public Response(boolean status, String message, Object payload) {
this.status = status;
this.message = message;
this.payload = payload;
}

public boolean isStatus() {
return status;
}

public void setStatus(boolean status) {
this.status = status;
}

public String getMessage() {
return message;
}

public void setMessage(String message) {
this.message = message;
}

public String getErrorCode() {
return errorCode;
}

public void setErrorCode(String errorCode) {
this.errorCode = errorCode;
}

public Object getPayload() {
return payload;
}

public void setPayload(Object payload) {
this.payload = payload;
}

}