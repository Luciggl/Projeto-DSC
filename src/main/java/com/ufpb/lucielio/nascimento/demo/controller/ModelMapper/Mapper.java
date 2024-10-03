package com.ufpb.lucielio.nascimento.demo.controller.ModelMapper;

import com.ufpb.lucielio.nascimento.demo.dto.ProdutoDTO;
import com.ufpb.lucielio.nascimento.demo.model.Produto;
import org.modelmapper.ModelMapper;

public class Mapper {
    private ModelMapper modelMapper;

    public ProdutoDTO convertToDTO(Produto p) {
        return modelMapper.map(p, ProdutoDTO.class);
    }

    public Produto convertToEntity(ProdutoDTO p){
        return modelMapper.map(p, Produto.class);
    }
}
