package com.example.simulado2024.controller;

import com.example.simulado2024.entity.Imovel;
import com.example.simulado2024.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("imovel")
public class ImovelController {
        @Autowired
        ImovelService imovelService;

        @GetMapping("buscar")
        public List<Imovel> buscarImoveis() {
            return imovelService.buscarImovel();
        }

        @PostMapping("cadastrar")
        public String cadastrarImovel(@RequestBody Imovel imovel) {
           imovelService.cadastrarImovel(imovel);
            return "Imovel cadastrado com sucesso";

        }

        @PutMapping("atualizar")
        public String atualizarImovel(@RequestBody Imovel imovel) {
            imovelService.atualizarImovel(imovel);
            return "Imovel atualizado com sucesso";
        }
        @DeleteMapping("deletar/{id}")
        public String apagarImovel(@PathVariable Long id) {
           imovelService.delete(id);
            return "Deletado com Sucesso";

        }
}
