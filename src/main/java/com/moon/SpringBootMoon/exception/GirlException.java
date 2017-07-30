package com.moon.SpringBootMoon.exception;

import com.moon.SpringBootMoon.enums.ResultEnum;

public class GirlException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = -6002372706429323191L;
    
    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
