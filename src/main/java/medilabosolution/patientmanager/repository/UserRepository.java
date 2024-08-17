package medilabosolution.patientmanager.repository;

import java.util.List;

import org.springframework.data.repository.RepositoryDefinition;

import medilabosolution.patientmanager.model.User;

@RepositoryDefinition(domainClass = User.class, idClass = Integer.class)
public interface UserRepository {
public User findByUsername(String username);

public User save(User user);

public User findById(int id);

public void deleteById(int id);
public List<User> findAll();
}
