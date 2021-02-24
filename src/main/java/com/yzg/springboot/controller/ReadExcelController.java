package com.yzg.springboot.controller;

import com.alibaba.excel.support.ExcelTypeEnum;
import com.yzg.springboot.entity.Student;
import com.yzg.springboot.service.TStudentDao;
import com.yzg.springboot.utils.EasyExcelUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.ss.usermodel.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;



@Controller
@Api(tags = "读取、导出excel文件数据123")
@RequestMapping("/readExcel")
public class ReadExcelController {

    @Autowired
    private TStudentDao dao;

    private Logger logger = LoggerFactory.getLogger(ReadExcelController.class);

    @PostMapping("/insert")
    @ApiOperation("导入excel数据")
    private void readExcel(MultipartFile file){
        try {
            List<Student> list = EasyExcelUtil.readExcelWithModel(file.getInputStream(), Student.class, ExcelTypeEnum.XLSX);
            logger.info("读取的excel数据为：" + list);
            long start = System.currentTimeMillis();
            list.forEach(e->{
                dao.insert(e);
            });
            long end = System.currentTimeMillis();
            logger.info("calculate Time is :" + (end-start) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @ApiOperation(value = "导出excel数据")
    @GetMapping("/exportExcel")
    public void exportExcel(HttpServletResponse response) {
        try{
            List<Student> res = dao.selectAll();
            EasyExcelUtil.writeExcel(response,res,"学生表格","学生表1", Student.class);
        } catch (Exception e) {
            logger.info(e.toString());
        }
    }
    
    //今天天气还不错

}
