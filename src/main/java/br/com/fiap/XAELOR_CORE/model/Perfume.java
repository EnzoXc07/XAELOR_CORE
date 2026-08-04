package br.com.fiap.XAELOR_CORE.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PERFUME")
public class Perfume {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "PERFUME_ID")
    private Long ID;

    @Column (nullable = false, name = "PERFUME_NOME")
    private String nomePerfume;

    @Column (nullable = false, name = "PERFUME_VALOR")
    private Double valorPerfume;

    @Column (nullable = false, name = "PERFUME_VALORCUSTO")
    private Double valorCustoPerfume;

    @Column (name = "PERFUME_DESCRICAO")
    private String descricaoPerfume;
}
