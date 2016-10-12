package com.faost.security.repository.security;

import com.faost.security.domain.security.Role;
import io.katharsis.queryParams.QueryParams;
import io.katharsis.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by re5 on 19.10.16.
 */

@Component
public class RoleResourseRepository implements ResourceRepository<Role, Long>{

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findOne(Long id, QueryParams queryParams) {
        return roleRepository.findOne(id);
    }

    @Override
    public Iterable<Role> findAll(QueryParams queryParams) {
        return roleRepository.findAll();
    }

    @Override
    public Iterable<Role> findAll(Iterable<Long> ids, QueryParams queryParams) {
        return roleRepository.findAll(ids);
    }

    @Override
    public <S extends Role> S save(S entity) {
        return roleRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        roleRepository.delete(id);
    }
}