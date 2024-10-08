package myaong.popolog.interviewservice.repository;

import myaong.popolog.interviewservice.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
