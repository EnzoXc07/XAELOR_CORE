package br.com.fiap.XAELOR_CORE.model;

import br.com.fiap.XAELOR_CORE.enums.TipoUnidade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "TB_PERFUME_MATERIA_PRIMA")
public class PerfumeMateriaPrima {

    @Column (name = "PERMAT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn (name = "PERFUME_ID")
    private Perfume id_perfume;

    @OneToMany
    @JoinColumn (name = "PERFUME_NOME")
    private Perfume nome_perfume;

    @OneToMany
    @JoinColumn (name = "MATPRIMA_ID")
    private MateriaPrima id_materiaPrima;

    @OneToMany
    @JoinColumn (name = "MATPRIMA_NOME")
    private MateriaPrima nome_materiaPrima;

    @Column(nullable = false, name = "PERMAT_VALORUNIDADE")
    private Double valorPorUnidade;

    @OneToMany
    @Column(nullable = false, name = "PERMAT_TIPOUNIDADE")
    @Enumerated(EnumType.STRING)
    private TipoUnidade tipoUnidade;

    @Column(nullable = false, name = "PERMAT_CUSTOTOTAL")
    private Double custoTotal;

    @Column(nullable = false, name = "PERMAT_MARGEMLUCRO")
    private BigDecimal margemLucro;

    @Column(nullable = false, name = "PERMAT_VALORFINAL")
    private Double valorFinal;
}
