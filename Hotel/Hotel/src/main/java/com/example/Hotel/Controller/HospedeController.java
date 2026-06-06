package com.example.Hotel.Controller;

import com.example.Hotel.Model.Hospede;
import com.example.Hotel.Service.HospedeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospedes")
public class HospedeController {

    private final HospedeService service;

    public HospedeController(HospedeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Hospede> listar() {
        return service.listar();
    }

    @PostMapping
    public Hospede salvar(@RequestBody Hospede hospede) {
        return service.salvar(hospede);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}