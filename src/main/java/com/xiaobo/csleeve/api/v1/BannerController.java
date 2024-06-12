package com.xiaobo.csleeve.api.v1;

import com.xiaobo.csleeve.Service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/banner")
@Validated
public class BannerController {
    @Autowired
    private BannerService bannerService;
    @GetMapping("/name/{name}")
    public void getByName(@PathVariable String name) {
        bannerService.getByName(name);
    }
}
