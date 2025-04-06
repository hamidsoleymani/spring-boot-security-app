package example2.springsecurity2;

import example2.springsecurity2.secconfig.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import example2.springsecurity2.secconfig.*;

@SpringBootApplication
public class SpringSecurity2Application implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurity2Application.class, args);
    }

    @Override
    public void run(String... args){
        User user = new User();
        user.setUsername("admin2");
        user.setPassword(passwordEncoder.encode("ppp"));
        user.setRole("ADMIN");
        user.setAuthority(user.getRole());
        //userRepository.save(user);
    }
}
