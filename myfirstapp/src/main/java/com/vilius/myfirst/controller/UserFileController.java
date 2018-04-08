package com.vilius.myfirst.controller;

import com.vilius.myfirst.model.UserFile;
import com.vilius.myfirst.service.UserFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFileController {
@Autowired
    private UserFileService userFileService;
@PostMapping("/UserFile")
    public ResponseEntity<?> save(@RequestBody UserFile userFile){
    long Id = userFileService.save(userFile);
    return ResponseEntity.ok().body("New User File has been saved with Id:" + Id);
}

}
