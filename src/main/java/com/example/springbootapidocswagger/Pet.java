package com.example.springbootapidocswagger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "My Pet value", description = "My Pet description")
public class Pet {

    @ApiModelProperty(value = "Pet nesnesinin Tekil id alanı")
    private int id;

    @ApiModelProperty(value = "Pet nesnesinin ad alanı")
    private String name;

    @ApiModelProperty(value = "Pet nesnesinin tarih alanı")
    private Date date;
}
