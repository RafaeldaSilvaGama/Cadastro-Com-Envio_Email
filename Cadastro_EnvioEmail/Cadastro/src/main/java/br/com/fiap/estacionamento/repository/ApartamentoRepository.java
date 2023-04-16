package br.com.fiap.estacionamento.repository;

import br.com.fiap.estacionamento.model.Apartamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartamentoRepository extends JpaRepository<Apartamento, Long> {
}