package co.istad.springmvcy2.repository;

import co.istad.springmvcy2.dto.CreateUserRequest;
import co.istad.springmvcy2.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepository(){
        users = new ArrayList<>();
//        User userAdmin = new User(UUID.randomUUID(), "ADMIN", "dara", "12134", true);
//        User userBusiness = new User(UUID.randomUUID(), "BUSINESS", "koma", "22134", true);
//        User userCustomer = new User(UUID.randomUUID(), "CUSTOMER", "Sitheang", "4321", true);

//        users.add(userAdmin);
//        users.add(userBusiness);
//        users.add(userCustomer);
    }

    public List<User> selectAll(){
        return  users;
    }

    public Optional<User> selectById(UUID id){

        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    public void removeById(UUID id){
        users.removeIf(user -> user.getId().equals(id));
    }

    public User createNewUser(CreateUserRequest createUserRequest) {

        User newUser = new User();
        newUser.setId(UUID.randomUUID());
        newUser.setName(createUserRequest.name());
        newUser.setUsername(createUserRequest.username());
        newUser.setPassword(createUserRequest.password());
        newUser.setIsActive(Boolean.TRUE);

        users.add(newUser);

        return newUser;
    }

}
