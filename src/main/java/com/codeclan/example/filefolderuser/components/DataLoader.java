package com.codeclan.example.filefolderuser.components;

import com.codeclan.example.filefolderuser.models.File;
import com.codeclan.example.filefolderuser.models.Folder;
import com.codeclan.example.filefolderuser.models.User;
import com.codeclan.example.filefolderuser.repositories.FileRepository;
import com.codeclan.example.filefolderuser.repositories.FolderRepository;
import com.codeclan.example.filefolderuser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;
    public DataLoader(){
    }
    public void run(ApplicationArguments args){
    User gavin = new User("Gavin");
    userRepository.save(gavin);
    User derek = new User("Derek");
    userRepository.save(derek);
    Folder pics = new Folder("pics", gavin);
    folderRepository.save(pics);
    Folder documents = new Folder("documents", gavin);
    folderRepository.save(documents);
    File holidaySnap = new File("Holiday Snap", ".jpg", 50, pics);
    fileRepository.save(holidaySnap);
    File cv = new File("CV", ".pdf", 67, documents);
    fileRepository.save(cv);


    }
}
