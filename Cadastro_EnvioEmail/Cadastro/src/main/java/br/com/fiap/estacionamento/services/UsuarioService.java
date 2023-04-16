package br.com.fiap.estacionamento.services;

import br.com.fiap.estacionamento.model.Usuario;
import br.com.fiap.estacionamento.repository.UsuarioRepository;
import org.springframework.stereotype.Service;



@Service
public class UsuarioService extends MyService<Usuario, Long>{

    public UsuarioService(UsuarioRepository repository) {super(repository);}
}