package com.iesb.apibiblioteca.service.implementations;

import com.iesb.apibiblioteca.jwt.JwtImpl;
import com.iesb.apibiblioteca.model.security.User;
import com.iesb.apibiblioteca.payload.request.auth.SignInRequest;
import com.iesb.apibiblioteca.payload.response.auth.JwtAuthResponse;
import com.iesb.apibiblioteca.service.AuthService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtImpl jwtImpl;

    private final UserServiceImpl userDetailsService;

    public AuthServiceImpl(AuthenticationManager authenticationManager, JwtImpl jwtImpl, UserServiceImpl userDetailsService) {
        this.authenticationManager = authenticationManager;
        this.jwtImpl = jwtImpl;
        this.userDetailsService = userDetailsService;
    }

    @Override
    public JwtAuthResponse signIn(SignInRequest signInRequest) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(signInRequest.getUsername(), signInRequest.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
        } catch (Exception exception) {
            throw new IllegalStateException(exception.getMessage());
        }

        User usuario = (User) userDetailsService.loadUserByUsername(signInRequest.getUsername());

        String token = jwtImpl.generateToken(usuario);

        return new JwtAuthResponse(usuario,token);
    }
}
