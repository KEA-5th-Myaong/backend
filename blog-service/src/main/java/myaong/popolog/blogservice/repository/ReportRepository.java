package myaong.popolog.blogservice.repository;

import myaong.popolog.blogservice.domain.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
}
