package com.yzg.springboot.controller;

import com.yzg.springboot.service.HandleFileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@Api(tags = "上传文件")
@RestController
@RequestMapping("/handleFile")
public class HandleFileController {

    @Autowired
    private HandleFileService service;

    @ApiOperation("文件上传")
    @PostMapping(value = "/uploadFile")
    public String convertPdfToWord(@RequestParam("file") MultipartFile file){
        service.convertPdfToWord(file);
        return "success";
    }
}
