package com.xiaobo.csleeve.api.v1;

import com.xiaobo.csleeve.sample.IConnect;
import com.xiaobo.csleeve.sample.ISkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/banner")
public class BannerController {
    @Autowired
    private ISkill iSkill;
    @Autowired
    private IConnect iConnect;

    @GetMapping("/test")
    public String test() throws Exception {
        iSkill.R();
        throw new Exception("这里错了");
//        return "Hello Xiaobo";
    }

    @GetMapping("/mysql")
    public void testMysql() {
        iConnect.connect();
    }
}
