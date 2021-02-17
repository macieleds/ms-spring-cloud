package com.edisonmaciel.hrworker.repositories;


import com.edisonmaciel.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
