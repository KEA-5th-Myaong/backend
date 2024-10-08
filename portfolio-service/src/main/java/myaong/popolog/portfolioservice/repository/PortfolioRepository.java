package myaong.popolog.portfolioservice.repository;

import myaong.popolog.portfolioservice.domain.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
}
