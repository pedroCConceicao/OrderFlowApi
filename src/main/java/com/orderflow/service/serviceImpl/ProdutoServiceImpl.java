package com.orderflow.service.serviceImpl;

import com.orderflow.domain.Pedido;
import com.orderflow.domain.Produto;
import com.orderflow.repository.ProdutoRepository;
import com.orderflow.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public List<Produto> buscarProdutos(Long codigoProduto) {
        Produto pedido = new Produto();
        pedido.setCodigoProduto(codigoProduto);

        ExampleMatcher matcher = ExampleMatcher.matchingAll()
                .withIgnoreNullValues();

        Example<Produto> example = Example.of(pedido, matcher);

        return produtoRepository.findAll(example);
    }

}
