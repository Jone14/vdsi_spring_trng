package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PartnerDriver;

@Repository
public interface DriverRepository extends JpaRepository<PartnerDriver, Long> {

}
