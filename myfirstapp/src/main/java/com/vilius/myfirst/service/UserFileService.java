package com.vilius.myfirst.service;

import java.util.List;
import com.vilius.myfirst.model.UserFile;
public interface UserFileService {

    long save(UserFile userFile);
    UserFile get(long Id);
    List<UserFile> list();
    void update(long Id, UserFile userFile);
    void delete(long Id);
}
