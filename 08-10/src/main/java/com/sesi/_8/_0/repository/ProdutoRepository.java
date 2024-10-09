package com.sesi._8._0.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi._8._0.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
   
}