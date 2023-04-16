package br.com.fiap.estacionamento.services;

import br.com.fiap.estacionamento.model.Carro;
import br.com.fiap.estacionamento.repository.CarroRepository;
import org.springframework.stereotype.Service;

@Service
public class CarroService extends MyService<Carro, Long>{

    public CarroService(CarroRepository repository) {super(repository);}
}
