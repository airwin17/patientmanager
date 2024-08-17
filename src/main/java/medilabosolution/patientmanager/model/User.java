package medilabosolution.patientmanager.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.Spring;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.validation.constraints.NotBlank;

public class User implements UserDetails {
private int id;
@NotBlank(message = "username cannot be blank")
private String username;
@NotBlank(message = "password cannot be blank")
private String password;
private Spring authority;

    public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public void setUsername(String username) {
    this.username = username;
}

public void setPassword(String password) {
    this.password = password;
}

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add((GrantedAuthority) authority);
        return authorities;
        
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

}
