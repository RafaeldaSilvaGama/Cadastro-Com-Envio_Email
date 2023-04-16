package br.com.fiap.estacionamento.model;


import br.com.fiap.estacionamento.idclass.ApartamentoId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_APARTAMENTO")
@IdClass(ApartamentoId.class)
public class Apartamento {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ApartamentoId id;

    @Column(nullable = false, length = 4)
    private int numero;

    @Column(nullable = false, length = 2)
    private int andar;

    @Column(nullable = false, length = 5)
    private String bloco;

    @Column(nullable = false, length = 2)
    private String predio;


    @MapsId("usuarioApartamento")
    private ApartamentoId usuarioApartamento;


    @OneToOne(cascade={CascadeType.DETACH})
    @JoinColumn(name = "vaga_id", nullable = false)
    private Vaga vaga;



}
