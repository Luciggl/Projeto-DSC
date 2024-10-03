package com.ufpb.lucielio.nascimento.demo.controller;

import com.ufpb.lucielio.nascimento.demo.controller.ModelMapper.Mapper;
import com.ufpb.lucielio.nascimento.demo.dto.ProdutoDTO;
import com.ufpb.lucielio.nascimento.demo.model.Categoria;
import com.ufpb.lucielio.nascimento.demo.model.Produto;
import com.ufpb.lucielio.nascimento.demo.service.ProdutoServices;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ProdutoController {
    private Mapper modelMapper;
    private final ProdutoServices produtoServices;

    public ProdutoController(Mapper modelMapper, ProdutoServices produtoServices) {
        this.modelMapper = modelMapper;
        this.produtoServices = produtoServices;
    }

    @GetMapping("/produtos")
    public List<ProdutoDTO> buscarProdutos(){
        List<Produto> p = produtoServices.buscarProdutos();
        return p.stream().map(produto -> modelMapper.convertToDTO(produto)).collect(Collectors.toList());
    }

    public List<ProdutoDTO> buscarPorCategoria(@RequestParam(name = "categoria", required = false)Categoria categoria){
        List<Produto> produtos = produtoServices.buscarPorCategoria(categoria);
        return produtos.stream().map(produto -> modelMapper.convertToDTO(produto)).collect(Collectors.toList());
    }


}
