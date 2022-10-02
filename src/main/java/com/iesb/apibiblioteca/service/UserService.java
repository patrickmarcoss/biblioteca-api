package com.iesb.apibiblioteca.service;

import com.iesb.apibiblioteca.dto.user.UserDTO;
import com.iesb.apibiblioteca.dto.user.UserDTOResponse;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public interface UserService {
    UserDTOResponse save(UserDTO userDTO) throws UsernameNotFoundException;
}
