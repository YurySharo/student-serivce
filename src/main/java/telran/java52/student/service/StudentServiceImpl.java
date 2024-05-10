package telran.java52.student.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import telran.java52.student.dao.StudentRepository;
import telran.java52.student.dto.ScoreDto;
import telran.java52.student.dto.StudentAddDto;
import telran.java52.student.dto.StudentDto;
import telran.java52.student.dto.StudentUpdateDto;
import telran.java52.student.dto.exception.StudentNotFoundException;
import telran.java52.student.model.Student;

@Component
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Boolean addStudent(StudentAddDto studentAddDto) {
		if(studentRepository.findById(studentAddDto.getId()).isPresent()) {
			return false;
		}
		Student student = new Student(studentAddDto.getId(), studentAddDto.getName(), studentAddDto.getPassword());
		studentRepository.save(student);
		return true;
	}

	@Override
	public StudentDto findStudent(Long id) {
		Student student = studentRepository.findById(id).orElseThrow(StudentNotFoundException::new);
		return new StudentDto(id, student.getName(), student.getScores());
	}

	@Override
	public StudentDto removeStudent(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentAddDto updateStudent(Long id, StudentUpdateDto studentUpdateDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addScore(Long id, ScoreDto scoreDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDto> findStudentsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getStudentsNamesQuantity(Set<String> names) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDto> getStudentsByExamMinScore(String exam, Integer minScore) {
		// TODO Auto-generated method stub
		return null;
	}

}
