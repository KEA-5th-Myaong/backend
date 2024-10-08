package myaong.popolog.inquiryservice.repository;

import myaong.popolog.inquiryservice.domain.MemberProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberProfileRepository extends JpaRepository<MemberProfile, Long> {
}
