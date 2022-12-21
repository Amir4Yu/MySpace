package com.vtxlab.demo.openweather.response.enums;

import lombok.Getter;

@Getter
public enum ResponseStatus {

  // code
  // message

  //// Success 20000-29999
  OK(20000, "Success."),

  // Fail 30000-39999
  FAIL(30000, "Fail."),
  THIRD_PARTY_API_FAIL(30001, "Third Party API Fail"),
  THIRD_PARTY_API_TIMEOUT(30002, "Third Party API Timeout"),

  // Runtime Exception 70000-71000
  NPE(70000, "Null Pointer Exception");

  Integer code;
  String message;

  ResponseStatus(Integer code, String message) {
    this.message = message;
    this.code = code;
  }
}
