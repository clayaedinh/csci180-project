package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
