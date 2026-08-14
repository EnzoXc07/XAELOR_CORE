package br.com.fiap.XAELOR_CORE.Controller;
import br.com.fiap.XAELOR_CORE.Service.PerfumeMateriaPrimaService;
import br.com.fiap.XAELOR_CORE.model.PerfumeMateriaPrima;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfumeMateriaPrima")

public class PerfumeMateriaPrimaController {
    private final PerfumeMateriaPrimaService perfumeMateriaPrimaService;

    public PerfumeMateriaPrimaController(PerfumeMateriaPrimaService perfumeMateriaPrimaService) {
        this.perfumeMateriaPrimaService = perfumeMateriaPrimaService;
    }

    @GetMapping
    public ResponseEntity<List<PerfumeMateriaPrima>> listar() {
        return ResponseEntity.ok(perfumeMateriaPrimaService.Listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PerfumeMateriaPrima> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(perfumeMateriaPrimaService.BuscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<PerfumeMateriaPrima> cadastrar(@Valid @RequestBody PerfumeMateriaPrima perfumeMateriaPrima) {
        return ResponseEntity.ok(perfumeMateriaPrimaService.cadastrar(perfumeMateriaPrima));
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<PerfumeMateriaPrima> atualizar(
            @PathVariable Long id,
            @Valid @RequestBody PerfumeMateriaPrima perfumeMateriaPrima) {
        return ResponseEntity.ok(perfumeMateriaPrimaService.atualizarPorId(perfumeMateriaPrima, id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletarPorId(@PathVariable Long id) {
        perfumeMateriaPrimaService.DeletarPorID(id);
        return ResponseEntity.noContent().build();
    }
}

