package com.alkemy.wallet.service;

import com.alkemy.wallet.entity.User;
import com.alkemy.wallet.repository.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    private final IUserRepository userRepository;

    public UserServiceImpl(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
