package com.hs.hscommon.common;


public interface Error {

    /**
     * 错误代码
     *
     * @return int
     */
    int getCode();

    /**
     * 错误描述
     *
     * @return {@link String}
     */
    String getMessage();

}
