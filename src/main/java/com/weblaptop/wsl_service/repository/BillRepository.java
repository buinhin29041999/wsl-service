package com.weblaptop.wsl_service.repository;

import com.weblaptop.wsl_service.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
