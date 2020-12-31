package org.tee.union.repositories.body;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tee.union.entities.body.Tenant;

@Repository
public interface TenantRepository extends JpaRepository<Tenant,Integer> {
}