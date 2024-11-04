package br.com.fiap.trajeto.repository;

import br.com.fiap.trajeto.model.Trajeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrajetoRepository extends JpaRepository<Trajeto, Long> {
}
