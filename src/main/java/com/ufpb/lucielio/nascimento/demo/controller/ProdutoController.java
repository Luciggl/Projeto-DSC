package com.ufpb.lucielio.nascimento.demo.controller;

import com.ufpb.lucielio.nascimento.demo.dto.ProdutoDTO;
import com.ufpb.lucielio.nascimento.demo.model.Produto;
import com.ufpb.lucielio.nascimento.demo.service.ProdutoServices;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ProdutoController {
    private ModelMapper modelMapper;
    private final ProdutoServices produtoServices;

    public ProdutoController(ModelMapper modelMapper, ProdutoServices produtoServices) {
        this.modelMapper = modelMapper;
        this.produtoServices = produtoServices;
    }

    @GetMapping("/produtos")
    public List<ProdutoDTO> buscarProdutos(){
        List<Produto> p = produtoServices.buscarProdutos();
        return p.stream().map(produto -> convertToDTO(produto)).collect(Collectors.toList());
    }

    private ProdutoDTO convertToDTO(Produto p) {
        return modelMapper.map(p, ProdutoDTO.class);
    }

    private Produto convertToEntity(ProdutoDTO p){
        return modelMapper.map(p, Produto.class);
    }
}
