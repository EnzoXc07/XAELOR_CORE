package br.com.fiap.XAELOR_CORE.Controller;

import br.com.fiap.XAELOR_CORE.Service.MateriaPrimaService;
import br.com.fiap.XAELOR_CORE.model.MateriaPrima;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materiaPrima")
public class MateriaPrimaController {

    private final MateriaPrimaService materiaPrimaService;

    public MateriaPrimaController(MateriaPrimaService materiaPrimaService) {
        this.materiaPrimaService = materiaPrimaService;
    }

    @GetMapping
    public ResponseEntity<List<MateriaPrima>> listar(){
        return ResponseEntity.ok(materiaPrimaService.Listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MateriaPrima> buscarPorID(@PathVariable Long id){
        MateriaPrima materiaPrima = materiaPrimaService.BuscarPorID(id);
        return ResponseEntity.ok(materiaPrima);
    }

    @PostMapping()
    public ResponseEntity<MateriaPrima> cadastrar(@Valid @RequestBody MateriaPrima materiaPrima){

        return ResponseEntity.ok(materiaPrimaService.cadastrar(materiaPrima));
    }

    //atualizar uma materia primaria pelo ID originario METODO POST
    @PutMapping("/atualizar/{id}")
    public ResponseEntity<MateriaPrima> AtualizarPorID(@PathVariable Long id, @Valid @RequestBody MateriaPrima materiaPrima){
        MateriaPrima existente = materiaPrimaService.BuscarPorID(id);

        existente.setNome(materiaPrima.getNome());
        existente.setTipoUnidade(materiaPrima.getTipoUnidade());

        if (materiaPrima.getDescricao() == null){
            existente.setDescricao("");
        }else{
            existente.setDescricao(materiaPrima.getDescricao());
        }
        return ResponseEntity.ok(existente);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> DeletarPorID(@PathVariable Long id){
        materiaPrimaService.deletarPorID(id);

        return ResponseEntity.noContent().build();
    }
}
