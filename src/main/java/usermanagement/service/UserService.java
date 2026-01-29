package usermanagement.service;

import org.springframework.stereotype.Service;
import usermanagement.model.User;
import usermanagement.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public void saveUser(User user) {
        repo.save(user);
    }
    
    public void deleteUser(Long id)) {
    repo.deleteById(id);
    }

}
