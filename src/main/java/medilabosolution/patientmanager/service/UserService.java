package medilabosolution.patientmanager.service;

import java.util.List;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.stereotype.Service;

import medilabosolution.patientmanager.model.User;
import medilabosolution.patientmanager.repository.UserRepository;

@Service
public class UserService {
private UserRepository userRepository;
public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
}
public User findByUsername(String username) {
    return userRepository.findByUsername(username);
}

public User save(User user) {
    String password = user.getPassword();
    user.setPassword(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode(password));
    return userRepository.save(user);
}
public List<User> findAll() {
    return userRepository.findAll();
}

public void deleteById(int id) {
    userRepository.deleteById(id);
}

}
