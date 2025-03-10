package com.orderflow.service;

import com.orderflow.domain.Produto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProdutoService {

    List<Produto> buscarProdutos(Long codigoProduto);

}
