package com.demo.service.mapper;

import com.demo.domain.Student;
import com.demo.service.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class StudentMapper {
    public List<StudentDTO> entitiesToDTOs(List<Student> students) {
        return students.stream()
            .filter(Objects::nonNull)
            .map(this::entityToDTO)
            .collect(Collectors.toList());
    }

    public StudentDTO entityToDTO(Student student) {
        return new StudentDTO(student);
    }

    public List<Student> DTOsToEntities(List<StudentDTO> studentDTOS) {
        return studentDTOS.stream()
            .filter(Objects::nonNull)
            .map(this::DTOtoEntity)
            .collect(Collectors.toList());
    }

    public Student DTOtoEntity(StudentDTO studentDTO) {
        if (studentDTO == null) {
            return null;
        } else {
            Student student = new Student();
            student.setId(studentDTO.getId());
            student.setFullName(studentDTO.getFullName());
            student.setAddress(studentDTO.getAddress());
            student.setPhoneNumber(studentDTO.getPhoneNumber());
            return student;
        }
    }
}
