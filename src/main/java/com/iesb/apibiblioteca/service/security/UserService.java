package com.iesb.apibiblioteca.service.security;

import com.iesb.apibiblioteca.dto.user.UserDTO;
import com.iesb.apibiblioteca.dto.user.UserDTOResponse;
import com.iesb.apibiblioteca.exception.AlreadyExistsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public interface UserService {
    UserDTOResponse save(UserDTO userDTO) throws AlreadyExistsException;
}
