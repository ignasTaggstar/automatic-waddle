package com.vilius.myfirst.service;

import java.util.List;
import com.vilius.myfirst.model.UserFile;
/**kiekvienas *Bean turi tureti anotacija kad galetum injectinti su @Autowired kitose klasese
Serviso klasem - @Service
Duomenu baziu - @Repository
Rest klasem - @Controller
Bendras - @Component
*/
public interface UserFileService {

    long save(UserFile userFile);
    UserFile get(long Id);
    List<UserFile> list();
    void update(long Id, UserFile userFile);
    void delete(long Id);
}
