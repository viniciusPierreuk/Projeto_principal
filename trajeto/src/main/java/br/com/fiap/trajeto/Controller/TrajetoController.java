package br.com.fiap.trajeto.Controller;
import br.com.fiap.trajeto.model.Trajeto;
import br.com.fiap.trajeto.service.TrajetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trajeto")
public class TrajetoController {

    @Autowired
    private  TrajetoService trajetoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Trajeto insertTrajeto (@RequestBody Trajeto trajeto) {
        return trajetoService.insertTrajeto(trajeto);
    }
    @GetMapping
    public List<Trajeto> getAllTrajetos() {
        return trajetoService .getAllTrajetos();
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public  void  deleteTrajeto(@PathVariable Long id)  {


        trajetoService.deleteMobilidade(id);

    }



    @PutMapping("/{id}")
    public Trajeto updateTrajeto(@PathVariable Long id, @RequestBody Trajeto trajeto) {
        return trajetoService.updateTrajeto(id, trajeto);
    }



}

