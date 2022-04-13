package br.com.microservice.loja.controller;

import br.com.microservice.loja.controller.dto.CompraDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compra")
public class CompraController {



    @PostMapping
    public void realizaCompra(@RequestBody CompraDTO compra){

    }
}
