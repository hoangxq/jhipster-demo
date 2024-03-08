package com.demo.service.mapper;

import com.demo.domain.StudentSubject;
import com.demo.service.dto.StudentDTO;
import com.demo.service.dto.StudentSubjectDTO;
import com.demo.service.dto.SubjectDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentSubjectMapper {
    private final StudentMapper studentMapper;
    private final SubjectMapper subjectMapper;

    public StudentSubjectMapper(StudentMapper studentMapper, SubjectMapper subjectMapper) {
        this.studentMapper = studentMapper;
        this.subjectMapper = subjectMapper;
    }

    public List<StudentSubjectDTO> entitiesToDTOs(List<StudentSubject> studentSubjects) {
        return studentSubjects.stream()
            .filter(Objects::nonNull)
            .map(this::entityToDTO)
            .collect(Collectors.toList());
    }

    public StudentSubjectDTO entityToDTO(StudentSubject studentSubject) {
        StudentDTO studentDTO = Optional.of(studentSubject.getStudent())
            .map(studentMapper::entityToDTO)
            .orElse(null);

        SubjectDTO subjectDTO = Optional.of(studentSubject.getSubject())
            .map(subjectMapper::entityToDTO)
            .orElse(null);

        return new StudentSubjectDTO(studentSubject, studentDTO, subjectDTO);
    }

    public List<StudentSubject> DTOsToEntities(List<StudentSubjectDTO> studentSubjectDTOS) {
        return studentSubjectDTOS.stream()
            .filter(Objects::nonNull)
            .map(this::DTOtoEntity)
            .collect(Collectors.toList());
    }

    public StudentSubject DTOtoEntity(StudentSubjectDTO studentSubjectDTO) {
        if (studentSubjectDTO == null) {
            return null;
        } else {
            StudentSubject studentSubject = new StudentSubject();
            studentSubject.setId(studentSubjectDTO.getId());
            studentSubject.setAttendancePoint(studentSubjectDTO.getAttendancePoint());
            studentSubject.setTestPoint(studentSubjectDTO.getTestPoint());
            studentSubject.setPracticePoint(studentSubjectDTO.getPracticePoint());
            studentSubject.setExamPoint(studentSubjectDTO.getExamPoint());
            studentSubject.setFinalPoint(studentSubjectDTO.getFinalPoint());
            studentSubject.setGpa(studentSubjectDTO.getGpa());
            studentSubject.setLetterPoint(studentSubjectDTO.getLetterPoint());
            return studentSubject;
        }
    }
}
