package myaong.popolog.blogservice.repository;

import myaong.popolog.blogservice.domain.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
