package com.ufpb.lucielio.nascimento.demo.service;

import com.ufpb.lucielio.nascimento.demo.model.Produto;
import com.ufpb.lucielio.nascimento.demo.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

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

    public Produto atualizarProduto(Long idProduto, Produto produto){
        Optional<Produto> produtoData = produtoRepository.findById(idProduto);
        Produto toUpdate = produtoData.orElseThrow(NoSuchElementException::new);
        toUpdate.setCategoriaProduto(produto.getCategoriaProduto());
        toUpdate.setNome(produto.getNome());
        toUpdate.setFabricante(produto.getFabricante());
        toUpdate.setQuantidade(produto.getQuantidade());
        toUpdate.setValor(produto.getValor());
        return toUpdate;
    }

    public Produto criarProduto(Produto produto){
        Produto p = produto;
        return produtoRepository.save(p);
    }

    public void apagarProduto(Long idFigurinha){
        Produto p = produtoRepository.findById(idFigurinha).orElseThrow(NoSuchElementException::new);
        produtoRepository.delete(p);
    }

}
