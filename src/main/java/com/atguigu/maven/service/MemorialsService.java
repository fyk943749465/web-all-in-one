package com.atguigu.maven.service;

import com.atguigu.maven.entity.Memorials;

import java.util.List;

public interface MemorialsService {

    List<Memorials>  getAllMemorialsDigest();

    Memorials getMemorialsDetailById(String memorialsId);

    void updateMemorialsStatusToRead(String memorialsId);

    void updateMemorialsFeedBack(String memorialsId, String feedbackContent);
}
