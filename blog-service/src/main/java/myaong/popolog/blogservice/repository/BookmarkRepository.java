package myaong.popolog.blogservice.repository;

import myaong.popolog.blogservice.domain.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
}
