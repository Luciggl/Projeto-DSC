package com.ufpb.lucielio.nascimento.demo.service;

import com.ufpb.lucielio.nascimento.demo.model.Produto;
import com.ufpb.lucielio.nascimento.demo.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProdutoServices {
    private final ProdutoRepository produtoRepository;

    public ProdutoServices(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> buscarProduto(Long idProduto){
        if (idProduto != null){
            return produtoRepository.findAllById(idProduto);
        }
        List<Produto> produtos = new ArrayList<>();
        produtoRepository.findAll().forEach(produtos::add);
        return produtos;
    }

    public List<Produto> buscarProdutos(){
        return produtoRepository.findAll();
    }
}
