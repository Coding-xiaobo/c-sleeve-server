package com.xiaobo.csleeve.core.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@ConfigurationProperties(prefix = "bo")
@PropertySource(value = "classpath:config/exception-code.properties") //关联配置类和配置文件
@Component //配置类需要注入到容器中，springboot才能匹配
public class ExceptionCodeConfiguration {
    private Map<Integer, String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return codes;
    }

    public void setCodes(Map<Integer, String> codes) {
        this.codes = codes;
    }

    public String getMessage(int code) {
        String message = codes.get(code);
        return message;
    }
}
