package br.com.fiap.estacionamento.services;

import br.com.fiap.estacionamento.model.Apartamento;
import br.com.fiap.estacionamento.repository.ApartamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class ApartamentoService extends MyService<Apartamento, Long>{

    public ApartamentoService(ApartamentoRepository repository) {super(repository);}
}
