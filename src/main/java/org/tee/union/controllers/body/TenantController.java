package org.tee.union.controllers.body;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tee.union.entities.body.Tenant;
import org.tee.union.services.body.TenantService;

import java.util.List;

@RestController
@RequestMapping(value = "/tenant")
@Slf4j
public class TenantController {

    private TenantService tenantService;

    public void setTenantService(TenantService tenantService) {
        this.tenantService = tenantService;
    }

    @GetMapping(value = "/browse")
    public ResponseEntity<List<Tenant>> browse(){
        return null;
    }
}