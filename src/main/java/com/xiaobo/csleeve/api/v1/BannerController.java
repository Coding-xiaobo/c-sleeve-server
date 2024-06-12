package com.xiaobo.csleeve.api.v1;

import com.xiaobo.csleeve.Exception.http.ForbiddenException;
import com.xiaobo.csleeve.dto.PersonDTO;
import com.xiaobo.csleeve.sample.ISkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;

@RestController
@RequestMapping("/banner")
@Validated
public class BannerController {
    @GetMapping("/name/{name}")
    public void getByName(@PathVariable String name) {

    }
}
