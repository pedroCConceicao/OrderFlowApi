package com.orderflow.controller;

import com.orderflow.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Scanner;

@RequestMapping("/produtos")
@RestController
@CrossOrigin(origins = "*")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping("/buscarProdutos")
    public ResponseEntity<?> buscarProdutos(@RequestParam(required = false) Long codigoProduto) {
        try {
            return ResponseEntity.ok(produtoService.buscarProdutos(codigoProduto));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
