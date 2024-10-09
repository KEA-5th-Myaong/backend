package myaong.popolog.blogservice.repository;

import myaong.popolog.blogservice.domain.MemberProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberProfileRepository extends JpaRepository<MemberProfile, Long> {
}
