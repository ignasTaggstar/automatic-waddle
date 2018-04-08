package com.vilius.myfirst.dao;

import com.vilius.myfirst.model.UserFile;

import java.util.List;

public interface UserFileDao {
    long save(UserFile userFile);
    UserFile get(long Id);
    List<UserFile> list();
    void update(long Id, UserFile userFile);
    void delete(long Id);
}
