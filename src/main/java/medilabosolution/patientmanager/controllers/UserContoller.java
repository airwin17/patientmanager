package medilabosolution.patientmanager.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import medilabosolution.patientmanager.model.User;
import medilabosolution.patientmanager.service.UserService;

@Controller
public class UserContoller {
    private UserService userService;

    public UserContoller(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/addUser")
    public ResponseEntity<String> addUser(@Valid @RequestBody User user) {
        userService.save(user);
        return ResponseEntity.ok("User added successfully");
    }
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.findAll());
    }
    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestParam int user) {
        userService.deleteById(user);
        return ResponseEntity.ok("User deleted successfully");
    }
}
