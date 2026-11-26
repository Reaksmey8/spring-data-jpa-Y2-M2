package co.istad.springmvcy2.init;

import co.istad.springmvcy2.model.User;
import co.istad.springmvcy2.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
@RequiredArgsConstructor
public class UserInitialization {

    private final UserRepository userRepository;

    @PostConstruct
    void init(){
        log.info("Initialization user data...");
        // 1. Create entity obj
        User user1 = new User();

        user1.setName("Administrator");
        user1.setUsername("admin");
        user1.setPassword("qwer");
        user1.setIsActive(Boolean.TRUE);

        User user2 = new User();

        user2.setName("Customer");
        user2.setUsername("customer");
        user2.setPassword("qwer");
        user2.setIsActive(Boolean.TRUE);

        User user3 = new User();

        user3.setName("Editor");
        user3.setUsername("editor");
        user3.setPassword("qwerQWER");
        user3.setIsActive(Boolean.TRUE);

        // 2. Start save user in database
        if (userRepository.count() == 0) {
            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);
        }
    }
}
