package com.xiaobo.csleeve.sample;

import com.xiaobo.csleeve.sample.hero.Diana;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroConfiguration {
    //@Bean注解，将方法返回的对象放入容器注解，将方法返回的对象放入容器
    @Bean
    @ConditionalOnBean(name = "mysql")
    public ISkill diana() {
        //配置类需要自己实例化，再放入容器
        return new Diana("Diana", 13); //会进入IOC容器
    }
}
