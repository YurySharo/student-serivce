package telran.java52.student.dao;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.mongodb.repository.MongoRepository;



import telran.java52.student.model.Student;

public interface StudentRepository extends MongoRepository<Student, Long> {
	Stream<Student> getAllBy();
	
//	Student save(Student student);
//
//	Optional<Student> findById(long id);
//
//	Collection<Student> findAll();
//
//	void deleteById(long id);

}
