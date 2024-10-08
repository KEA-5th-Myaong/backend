package myaong.popolog.memberservice.repository;

import myaong.popolog.memberservice.domain.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow, Long> {
}
