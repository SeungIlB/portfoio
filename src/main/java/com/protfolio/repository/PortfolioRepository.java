package com.protfolio.repository;

import com.protfolio.entity.PortfolioInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<PortfolioInfo, Long> {
}
