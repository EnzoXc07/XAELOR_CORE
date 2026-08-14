package br.com.fiap.XAELOR_CORE.Controller;

import br.com.fiap.XAELOR_CORE.Service.PerfumeService;
import br.com.fiap.XAELOR_CORE.model.Perfume;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfume")
public class PerfumeController {

    private final PerfumeService perfumeService;

    public PerfumeController(PerfumeService perfumeService) {
        this.perfumeService = perfumeService;
    }

    @GetMapping
    public ResponseEntity<List<Perfume>> listar() {
        return ResponseEntity.ok(perfumeService.Listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Perfume> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(perfumeService.BuscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Perfume> cadastrar(@Valid @RequestBody Perfume perfume) {
        return ResponseEntity.ok(perfumeService.cadastrar(perfume));
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Perfume> atualizar(@PathVariable Long id, @Valid @RequestBody Perfume perfume) {
        return ResponseEntity.ok(perfumeService.Atualizar(id, perfume));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletarPorId(@PathVariable Long id) {
        perfumeService.DeletarPorId(id);
        return ResponseEntity.noContent().build();
    }
}
