package ls.ler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ls.ler.models.Student;
import ls.ler.repository.StudentRepository;

@Service
public class StudentService {
 @Autowired
 private StudentRepository repository;
 public void save(Student student) {
  repository.save(student);
 }
}