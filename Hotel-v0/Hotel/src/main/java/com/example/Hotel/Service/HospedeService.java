package com.example.Hotel.Service;

import com.example.Hotel.Model.Hospede;
import com.example.Hotel.Repository.HospedeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospedeService {


    private final HospedeRepository repository;

    public HospedeService(HospedeRepository repository) {
        this.repository = repository;
    }

    public List<Hospede> listar() {
        return repository.findAll();
    }

    public Hospede salvar(Hospede hospede) {
        return repository.save(hospede);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}