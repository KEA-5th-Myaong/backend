package myaong.popolog.prejobsservice.repository;

import myaong.popolog.prejobsservice.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
