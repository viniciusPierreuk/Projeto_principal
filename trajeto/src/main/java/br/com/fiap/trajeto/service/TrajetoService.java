package br.com.fiap.trajeto.service;

import br.com.fiap.trajeto.model.Trajeto;
import br.com.fiap.trajeto.repository.TrajetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import  org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class TrajetoService {


    @Autowired
    private TrajetoRepository trajetoRepository;


    public Trajeto insertTrajeto(Trajeto trajeto) {

        return trajetoRepository.save(trajeto);
    }
    public List<Trajeto>getAllTrajetos() {
        return trajetoRepository.findAll();
    }

    public void deleteMobilidade(Long id) {

        Optional<Trajeto> trajetoOp = trajetoRepository.findById(id);
        if (trajetoOp.isPresent()){
            trajetoRepository.delete(trajetoOp.get());
        }else {

            throw new RuntimeException("MOBILIDADE NOT FOUND");
        }
        //  mobilidadeRepository.deleteById(id);

    }


    public Trajeto updateTrajeto(Long id, Trajeto trajetoAtualizada) {

        Trajeto trajeto = trajetoRepository.findById(id).orElse(null);


        if (trajeto == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Mobilidade não encontrada");
        }


        trajeto.setPartida(trajetoAtualizada.getPartida());
        trajeto.setDestino(trajetoAtualizada.getDestino());
        trajeto.setStatus(trajetoAtualizada.getStatus());

        trajeto.setReleaseDate(trajetoAtualizada.getReleaseDate());


        return trajetoRepository.save(trajeto);
    }

}