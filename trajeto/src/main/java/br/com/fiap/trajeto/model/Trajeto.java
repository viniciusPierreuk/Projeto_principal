package br.com.fiap.trajeto.model;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_trajeto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Trajeto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TRAJETOS")
    @SequenceGenerator(name = "SEQ_TRAJETOS", allocationSize = 1)
    private Long trajetoId;

    private String partida;
    private String destino;
    private String status;





    @Column(name = "release_date")
    private LocalDate releaseDate;


}
