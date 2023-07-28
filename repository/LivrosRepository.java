package com.catalisa.darkSideBooks.repository;

import com.catalisa.darkSideBooks.model.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrosRepository extends JpaRepository<LivroModel, Long> { }
