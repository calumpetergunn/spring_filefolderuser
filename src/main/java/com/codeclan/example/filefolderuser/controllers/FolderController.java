package com.codeclan.example.filefolderuser.controllers;

import com.codeclan.example.filefolderuser.models.Folder;
import com.codeclan.example.filefolderuser.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FolderController {
    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value="/folders")
    public ResponseEntity<List<Folder>> getAllFolders(){
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/folders/{id}")
    public ResponseEntity getFolder(@PathVariable Long id){
        return new ResponseEntity<>(folderRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/folders")
    public ResponseEntity<Folder> postFolder(@RequestBody Folder folder){
        return new ResponseEntity<>(folderRepository.save(folder), HttpStatus.CREATED);
    }
}
