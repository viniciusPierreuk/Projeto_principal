package br.com.fiap.trajeto.service;


import br.com.fiap.trajeto.model.User;
import br.com.fiap.trajeto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired

    private UserRepository userRepository;

    public  User save(User user){

        String encodedpassword = new BCryptPasswordEncoder().encode(user.getPassword());
        user.setPassword(encodedpassword);
        return userRepository.save(user);
    }
}
