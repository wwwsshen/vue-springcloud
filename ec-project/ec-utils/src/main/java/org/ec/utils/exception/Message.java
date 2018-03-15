package org.ec.utils.exception;

import org.ec.utils.MessageUtil;

public class Message {

    /**
     * errorCode
     */
    private String errorCode;

    /**
     * args
     */
    private String[] args;

    public Message(String errorCode) {
        this.errorCode = errorCode;
    }

    public Message(String errorCode, String... args) {
        this.errorCode = errorCode;
        this.args = args;
    }

    @Override
    public String toString() {
        return MessageUtil.getMessage(this.errorCode, this.args);
    }

    /**
     * 取得errorCode
     * @return
     */
    public String getErrorCode() {
        return this.errorCode;
    }
}
