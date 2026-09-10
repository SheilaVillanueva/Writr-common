package com.example.commons.repository;

import com.example.commons.entity.DocumentoTag;
import com.example.commons.entity.DocumentoTagId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoTagRepository extends JpaRepository<DocumentoTag, DocumentoTagId> {
}
