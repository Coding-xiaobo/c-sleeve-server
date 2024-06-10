package com.xiaobo.csleeve.api.v1;

import com.xiaobo.csleeve.Exception.http.ForbiddenException;
import com.xiaobo.csleeve.dto.PersonDTO;
import com.xiaobo.csleeve.sample.ISkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/banner")
public class BannerController {
    @Autowired
    private ISkill iSkill;

    @PostMapping("/test/{id}")
    public String test(@PathVariable Integer id, @RequestParam String name, @RequestBody PersonDTO person) throws Exception {
        System.out.println(id);
        System.out.println(name);
        iSkill.R();
        throw new ForbiddenException(10000);
    }
}
