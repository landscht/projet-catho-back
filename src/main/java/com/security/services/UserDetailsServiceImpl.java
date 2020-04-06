package com.security.services;

import com.models.User;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found With Username :" + username));

        return UserDetailsImpl.build(user);
    }

    public List<UserDetails> getAll() {
        Iterable<User> users = userRepository.findAll();
        List<UserDetails> userDetails = new ArrayList<>();
        for(User u : users) {
            userDetails.add(UserDetailsImpl.build(u));
        }
        return userDetails;
    }


}
