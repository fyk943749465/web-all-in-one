package com.atguigu.maven.dao;

import com.atguigu.maven.entity.Memorials;

import java.util.List;

public interface MemorialsDao {

    List<Memorials> selectAllMemorialsDigest();

    Memorials selectMemorialsById(String memorialsId);

    void updateMemorialsStatusToRead(String memorialsId);

    void updateMemorialsFeedBack(String memorialsId, String feedbackContent);
}
