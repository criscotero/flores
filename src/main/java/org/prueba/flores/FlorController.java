package org.prueba.flores;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
@AllArgsConstructor
@RequestMapping("api/v1/flores")
public class FlorController {

    private final FlorService florService;

    @PostMapping("/crear-flor")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> agregarFlor (@RequestBody AgregarFlorRequest request){

        log.info("new flor to add {} ", request);
        florService.agregarFlor(request);
        return ResponseEntity.ok("flor agregada con exito: " + request);
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
     public ResponseEntity<List<Flor>> findAllFlores() {
        log.info("requesting all flores ");

        // todo: manejar de conexion
        return ResponseEntity.ok(florService.findAllFlores());
    }

    @GetMapping("/{nombre}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Flor>> findAllFloresByName(@PathVariable String nombre) {
        log.info("requesting all flores ");

        // todo: manejar de conexion
        return ResponseEntity.ok(florService.findAllFloresByName(nombre));
    }


    @PostMapping("/flores-batch")
    @ResponseBody
    public ResponseEntity<String> insertNewBatchFlores_delete(@RequestBody List<Flor> flores) {
        florService.deleteAllAndSaveNewBatch(flores);
        return ResponseEntity.ok("Se crearon las flores");
    }



}
