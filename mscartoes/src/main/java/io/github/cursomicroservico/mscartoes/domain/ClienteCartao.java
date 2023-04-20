package io.github.cursomicroservico.mscartoes.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class ClienteCartao {
    
    @Id
    @GeneratedValue
    private Long id;
    private String cpf;
    @ManyToOne
    @JoinColumn(name="id_cartao")
    private Cartao cartao;
    private BigDecimal limite;

}
