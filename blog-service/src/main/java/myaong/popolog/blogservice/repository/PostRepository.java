package myaong.popolog.blogservice.repository;

import myaong.popolog.blogservice.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
