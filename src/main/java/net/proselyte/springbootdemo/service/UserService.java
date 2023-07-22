package net.proselyte.springbootdemo.service;

import net.proselyte.springbootdemo.model.User;
import net.proselyte.springbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // объявление бина, в котором реализуется бизнес-логика
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    // со Spring 4.0 аннотацию @Autowired можно не ставить на конструктор,
    // если он единственный в классе.
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.getOne(id);
        // либо
        // return userRepository.findById(id).orElse(null);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
