package com.iesb.apibiblioteca.dto.user;

import com.iesb.apibiblioteca.model.security.Role;

import java.util.HashSet;
import java.util.Set;

public class UserDTO extends BaseUserDTO {

    private String password;
    private String email;
    private Set<Role> roles = new HashSet<>();

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
