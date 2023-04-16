package br.com.fiap.estacionamento.idclass;

import br.com.fiap.estacionamento.model.Usuario;
import jakarta.persistence.*;

import java.io.Serializable;

public class ApartamentoId implements Serializable {

    private static final long serialVertionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    @EmbeddedId
    private Usuario usuarioApartamento;
}
