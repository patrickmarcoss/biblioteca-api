package com.iesb.apibiblioteca.payload.response.auth;

import com.iesb.apibiblioteca.model.security.User;

public class JwtAuthResponse {
    private Long id;
    private String username;
    private String token;

    public JwtAuthResponse(final User user, String token) {
        id = user.getId();
        username = user.getUsername();
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
