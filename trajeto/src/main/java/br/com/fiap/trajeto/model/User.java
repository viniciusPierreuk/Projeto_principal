package br.com.fiap.trajeto.model;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "tb_users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {



    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_USERS"
    )
    @SequenceGenerator(
            name = "SEQ_USERS",
            sequenceName = "SEQ_USERS",
            allocationSize = 1
    )
    @Column(name = "user_id")
    private Long userId;

    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role; // papel que o usuário



}


