package myaong.popolog.memberservice.repository;

import myaong.popolog.memberservice.domain.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
