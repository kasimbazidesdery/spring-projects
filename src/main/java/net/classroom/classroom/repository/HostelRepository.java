package net.classroom.classroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.classroom.classroom.entity.StudentRoom;

public interface HostelRepository extends JpaRepository<StudentRoom, Long>{
    
}
