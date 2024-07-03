package com.example.simulado2024.controller;

import com.example.simulado2024.entity.Imovel;
import com.example.simulado2024.entity.Proprietario;
import com.example.simulado2024.service.ImovelService;
import com.example.simulado2024.service.ProprietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("proprietario")
public class ProprietarioController {
    @Autowired
    ProprietarioService proprietarioService;

    @GetMapping("buscar")
    public List<Proprietario> buscarProprietario() {
        return proprietarioService.buscarProprietario();
    }

    @PostMapping("cadastrar")
    public String cadastrarProprietario(@RequestBody Proprietario proprietario) {
        proprietarioService.cadastrarProprietario(proprietario);
        return "Proprietario cadastrado com sucesso";

    }

    @PutMapping("atualizar")
    public String atualizarProprietario(@RequestBody Proprietario proprietario) {
       proprietarioService.atualizarProprietario(proprietario);
        return "Proprietario atualizado com sucesso";
    }
    @DeleteMapping("deletar/{id}")
    public String apagarProprietario(@PathVariable Long id) {
       proprietarioService.delete(id);
        return "Deletado com Sucesso";

    }
}
