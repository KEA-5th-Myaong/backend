package myaong.popolog.blogservice.repository;

import myaong.popolog.blogservice.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
}
