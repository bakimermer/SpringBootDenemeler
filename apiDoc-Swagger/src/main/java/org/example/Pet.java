package org.example;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Pet Nesnesi", description = "test")
public class Pet {
    @ApiModelProperty(value = "Pet nesnesinin id'si")
    private Integer id;

    @ApiModelProperty(value = "Pet nesnesinin adı")
    private String name;

    @ApiModelProperty(value = "Pet nesnesinin tarihi")
    private Date date;

}
