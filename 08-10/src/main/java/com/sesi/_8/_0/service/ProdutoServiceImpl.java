package com.sesi._8._0.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesi._8._0.model.Produto;
import com.sesi._8._0.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository; 
    }

    @Override
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll(); 
    }

    @Override
    public void salvarProduto(Produto produto) {
        produtoRepository.save(produto); 
    }

    @Override
    public Produto buscarProdutoPorId(Long id) {
        return produtoRepository.findById(id).orElse(null); 
    }

    @Override
    public void atualizarProduto(Long id, Produto produto) {
        if (produtoRepository.existsById(id)) {
            produto.setId(id);
            produtoRepository.save(produto); 
        }
    }

    @Override
    public void excluirProduto(Long id) {
        produtoRepository.deleteById(id); 
    }
}