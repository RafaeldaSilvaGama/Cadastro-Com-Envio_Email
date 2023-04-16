package br.com.fiap.estacionamento.model;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;


@Data
@Entity
@Table(name = "TB_VAGAS")
public class Vaga implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 3)
    private int numero;

    @Column(nullable = false, length = 2)
    private String andarGaragem;

    @OneToOne(cascade={CascadeType.DETACH})
    @JoinColumns({@JoinColumn(name = "apartamento_id", referencedColumnName = "id", nullable = false),
                 @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id", nullable = false)})
    private Apartamento apartamento;


    @OneToOne(cascade={CascadeType.DETACH})
    @JoinColumn(name = "carro_id", nullable = false)
    private Carro carro;


}
