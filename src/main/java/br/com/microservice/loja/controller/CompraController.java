package br.com.microservice.loja.controller;

import br.com.microservice.loja.dto.CompraDTO;
import br.com.microservice.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public void realizaCompra(@RequestBody CompraDTO compra){
        compraService.realizaCompra(compra);
    }
}
