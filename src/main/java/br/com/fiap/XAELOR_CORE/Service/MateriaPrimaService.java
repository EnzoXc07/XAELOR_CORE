package br.com.fiap.XAELOR_CORE.Service;

import br.com.fiap.XAELOR_CORE.Repository.MateriaPrimaRepository;
import br.com.fiap.XAELOR_CORE.Repository.PerfumeRepository;
import br.com.fiap.XAELOR_CORE.enums.TipoUnidade;
import br.com.fiap.XAELOR_CORE.model.MateriaPrima;
import org.springframework.stereotype.Service;

@Service
public class MateriaPrimaService {

    private final MateriaPrimaRepository materiaPrimaRepository;

    public MateriaPrimaService(MateriaPrimaRepository materiaPrimaRepository) {
        this.materiaPrimaRepository = materiaPrimaRepository;
    }

    public MateriaPrima cadastrar(MateriaPrima materiaPrima, TipoUnidade tipoUnidade){

        if (materiaPrima.getNome() == null || materiaPrima.getNome().isBlank()){
            throw new RuntimeException("Nome é obrigatorio");
        }

        if (materiaPrima.getTipoUnidade() == null){

        }

        return materiaPrima;
    }
}
