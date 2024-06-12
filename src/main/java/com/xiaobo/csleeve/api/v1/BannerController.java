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
    @Autowired
    private ISkill iSkill;

    @PostMapping("/test/{id}")
    public PersonDTO test(@PathVariable @Max(value = 10, message = "不可以超过10..") Integer id, @RequestParam String name, @RequestBody @Validated PersonDTO person) throws Exception {
        System.out.println(id);
        System.out.println(name);
        //使用builder就不可以new实例化了
        //PersonDTO dto1 = new PersonDTO();
        PersonDTO dto = PersonDTO.builder().name("xiaobo").age(18).build();
        return dto;
//        iSkill.R();
//        throw new ForbiddenException(10000);
    }
}
