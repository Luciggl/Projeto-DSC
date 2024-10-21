package com.ufpb.lucielio.nascimento.demo.config;

import com.ufpb.lucielio.nascimento.demo.enums.FunctionUser;
import com.ufpb.lucielio.nascimento.demo.model.Usuarios;
import com.ufpb.lucielio.nascimento.demo.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AdminUserSeeder {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AdminUserSeeder(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostConstruct
    public void seedAdminUser(){
        if (userRepository.findByUsername("admin") == null){
            Usuarios admin = new Usuarios();
            admin.setUsername("admin");
            admin.setNome("Admin");
            admin.setEmail("admin@admin.com");
            admin.setPassword(passwordEncoder.encode("admin123"));
            admin.setFunction(FunctionUser.ADMIN);
            userRepository.save(admin);
        }
    }
}
