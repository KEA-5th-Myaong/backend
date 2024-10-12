package myaong.popolog.interviewservice.repository;

import myaong.popolog.interviewservice.domain.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRepository extends JpaRepository<Interview, Long> {
}
