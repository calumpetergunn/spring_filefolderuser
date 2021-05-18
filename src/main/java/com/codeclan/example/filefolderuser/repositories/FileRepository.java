package com.codeclan.example.filefolderuser.repositories;

import com.codeclan.example.filefolderuser.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
