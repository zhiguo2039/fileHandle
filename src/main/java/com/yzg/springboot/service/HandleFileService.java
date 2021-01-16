package com.yzg.springboot.service;

import org.springframework.web.multipart.MultipartFile;

public interface HandleFileService {
    void convertPdfToWord(MultipartFile file);
}
