package br.com.fiap.trajeto.repository;

import br.com.fiap.trajeto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Integer> {


   UserDetails findByEmail(String email);
}
