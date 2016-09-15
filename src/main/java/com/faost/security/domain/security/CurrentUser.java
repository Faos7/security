package com.faost.security.domain.security;

import org.springframework.security.core.authority.AuthorityUtils;

public class CurrentUser extends org.springframework.security.core.userdetails.User{

    private User user;

    public CurrentUser(User user) {
        super(user.getEmail(), user.getPasswordHash(), AuthorityUtils.createAuthorityList(user.getRole().toString()));
        this.user = user;
    }

    public  User getUser(){
        return user;
    }

    public Integer getId(){
        return user.getId();
    }

    public Role getRole() {
        return user.getRole();
    }

}
