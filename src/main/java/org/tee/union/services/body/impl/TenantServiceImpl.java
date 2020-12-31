package org.tee.union.services.body.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.tee.union.repositories.body.TenantRepository;
import org.tee.union.services.body.TenantService;

@Service
@Slf4j
public class TenantServiceImpl implements TenantService {

    private TenantRepository tenantRepository;

    public void setTenantRepository(TenantRepository tenantRepository) {
        this.tenantRepository = tenantRepository;
    }


}
