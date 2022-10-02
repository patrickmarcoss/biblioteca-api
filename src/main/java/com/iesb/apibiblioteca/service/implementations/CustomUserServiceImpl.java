package com.iesb.apibiblioteca.service.implementations;

import com.iesb.apibiblioteca.dto.user.UserDTO;
import com.iesb.apibiblioteca.dto.user.UserDTOResponse;
import com.iesb.apibiblioteca.model.security.Role;
import com.iesb.apibiblioteca.model.security.User;
import com.iesb.apibiblioteca.repository.RoleRepository;
import com.iesb.apibiblioteca.repository.UserRepository;
import com.iesb.apibiblioteca.service.UserService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class CustomUserServiceImpl implements UserService {

    private final UserRepository userRepo;
    private final RoleRepository roleRepo;
    private final BCryptPasswordEncoder passwordEncoder;

    public CustomUserServiceImpl(UserRepository userRepo, RoleRepository roleRepo, BCryptPasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDTOResponse save(UserDTO userDTO) {
        User u = new User();
        Optional<Role> role = roleRepo.findById(1L);
        Set<Role> roles = new HashSet<>();

        if(role.isPresent()) {
            Role r = new Role();
            r.setName(role.get().getName());
            r.setId(role.get().getId());
            roles.add(r);
            u.setRoles(roles);
        }

        u.setEmail(userDTO.getEmail());
        u.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        u.setUsername(userDTO.getUsername());
        userRepo.save(u);

        UserDTOResponse uDTO = new UserDTOResponse();
        uDTO.setUsername(u.getUsername());
        uDTO.setEmail(u.getEmail());
        uDTO.setId(u.getId());

        return uDTO;
    }
}
