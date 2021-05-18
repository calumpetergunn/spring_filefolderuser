package com.codeclan.example.filefolderuser.repositories;

import com.codeclan.example.filefolderuser.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
