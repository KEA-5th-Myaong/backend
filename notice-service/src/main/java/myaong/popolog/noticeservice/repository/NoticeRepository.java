package myaong.popolog.noticeservice.repository;

import myaong.popolog.noticeservice.domain.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
}
