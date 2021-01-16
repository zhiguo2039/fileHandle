package com.yzg.springboot.service.impl;

import com.spire.pdf.PdfDocument;
import com.spire.pdf.widget.PdfPageCollection;
import com.yzg.springboot.service.HandleFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Service
public class HandleFileServiceImpl implements HandleFileService {

    private static Logger logger = LoggerFactory.getLogger(HandleFileServiceImpl.class);

    @Override
    public void convertPdfToWord(MultipartFile file) {
        String pathName = "C:\\Users\\Administrator\\Desktop\\upload\\";
        String fileName = file.getOriginalFilename();
        String fileFullName = pathName + fileName;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fileFullName);
            fos.write(file.getBytes()); // 写入文件
            logger.info(fileFullName + "上传成功！");
        } catch (Exception e) {
            logger.info(e.getMessage());
            logger.error(fileFullName + "上传失败！");
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                logger.info(e.getMessage());
            }
        }
        convertPdf(pathName, fileName);

    }

    public static void convertPdf(String pathName, String fileName){
        String desPath =pathName + fileName.substring(0, fileName.length()-4)+".docx";
        String srcPath = pathName + fileName;
        try {
            // 1、加载pdf
            PdfDocument pdf = new PdfDocument();
            pdf.loadFromFile(srcPath);
            pdf.saveToFile(desPath, com.spire.pdf.FileFormat.DOCX);
            logger.info("PDF转word完毕！");
        } catch (Exception e) {
        }
    }

}
