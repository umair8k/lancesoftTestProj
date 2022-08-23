package ls.ler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ls.ler.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
