package myaong.popolog.interviewservice.repository;

import myaong.popolog.interviewservice.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
