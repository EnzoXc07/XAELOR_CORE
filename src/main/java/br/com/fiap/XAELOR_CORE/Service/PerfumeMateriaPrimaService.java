package br.com.fiap.XAELOR_CORE.Service;

import br.com.fiap.XAELOR_CORE.Repository.PerfumeMateriaPrimaRepository;
import br.com.fiap.XAELOR_CORE.model.PerfumeMateriaPrima;
import org.springframework.stereotype.Service;

@Service
public class PerfumeMateriaPrimaService {

    private final PerfumeMateriaPrimaRepository perfumeMateriaPrimaRepository;

    public PerfumeMateriaPrimaService(PerfumeMateriaPrimaRepository perfumeMateriaPrimaRepository) {
        this.perfumeMateriaPrimaRepository = perfumeMateriaPrimaRepository;
    }

    public PerfumeMateriaPrima cadastrar(PerfumeMateriaPrima perfumeMateriaPrima){
        if(perfumeMateriaPrima.getValorPorUnidade() == null || perfumeMateriaPrima.getValorPorUnidade() <= 0) {
            throw new RuntimeException();
        }
        return perfumeMateriaPrimaRepository.save(perfumeMateriaPrima);
    }
}
