package com.yzg.springboot.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;


/**
 * t_student
 * @author 
 */
@Data
public class Student extends BaseRowModel implements Serializable {

    @ExcelProperty(value = "id")
    @Id
    @Generated
    private Integer id;

    @ExcelProperty(value = "name")
    private String name;

    @ExcelProperty(value = "phone")
    private String phone;

    @ExcelProperty(value = "sex")
    private String sex;

    @ExcelProperty(value = "salary")
    private BigDecimal salary;

    @ExcelProperty(value = "age")
    private Integer age;

    @ExcelProperty(value = "date")
    private Date date;

    private static final long serialVersionUID = 1L;
}