package com.codecool.marwin1991.service;

import com.codecool.marwin1991.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        throw new RuntimeException("not implemented");
    }

    @Override
    public UserDetails loadUserById(String id) {
        throw new RuntimeException("not implemented");
    }
}
