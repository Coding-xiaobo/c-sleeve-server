package com.xiaobo.csleeve.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;


@Builder
@Getter
public class PersonDTO {
    @Length(min = 2, max = 10, message = "姓名长度必须在2到10之间")
    private String name;
    private Integer age;

    private String pwd1;
    private String pwd2;
}
