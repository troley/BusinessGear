package com.renarcus.businessgear.service.admin;

import com.renarcus.businessgear.dao.admin.AdminDaoImpl;
import com.renarcus.businessgear.model.Admin;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * CustomUserService is taking care of custom user-service thanks to UserDetailsService.
 * No manual xml user-service accounts needed any more. It works with new registered accounts
 * as well as the existing (login) ones.
 */
@Service
public class CustomUserService implements UserDetailsService{

    private static final Logger LOG = LoggerFactory.logger(AdminDaoImpl.class);
    private AdminService adminService;

    @Autowired
    public CustomUserService(AdminService adminService) {
        this.adminService = adminService;
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LOG.info("Getting admin details.");
        Admin fetchedAdmin = adminService.getItemById(username);

        if (fetchedAdmin == null) {
            throw new UsernameNotFoundException("The username " + username + " was not found.");
        }

        return new User(username, fetchedAdmin.getPassword(), getAuthorities());
    }

    private Set<SimpleGrantedAuthority> getAuthorities() {
        Set<SimpleGrantedAuthority> authSet = new HashSet<SimpleGrantedAuthority>();
        authSet.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return authSet;
    }
}
