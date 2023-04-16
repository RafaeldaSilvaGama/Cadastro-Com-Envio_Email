package br.com.fiap.estacionamento.services;


import br.com.fiap.estacionamento.model.Vaga;
import br.com.fiap.estacionamento.repository.VagaRepository;
import org.springframework.stereotype.Service;

@Service
public class VagaService extends MyService<Vaga, Long>{

    public VagaService(VagaRepository repository) {super(repository);}
}
