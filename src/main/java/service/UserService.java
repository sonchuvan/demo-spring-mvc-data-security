package service;

import entity.user.AppUser;
import entity.user.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import repository.AppUserRepository;

public class UserService implements UserDetailsService {

    @Autowired
    private AppUserRepository appUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = appUserRepository.findByUserName(username);
        if (appUser == null){
            throw new UsernameNotFoundException(username);
        }
        return new CustomUserDetails(appUser);
    }

    public UserDetails loadUserById(Long id){}
}
