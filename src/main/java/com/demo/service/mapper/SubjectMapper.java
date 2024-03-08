package com.demo.service.mapper;

import com.demo.domain.Subject;
import com.demo.service.dto.SubjectDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class SubjectMapper {
    public List<SubjectDTO> entitiesToDTOs(List<Subject> subjects) {
        return subjects.stream()
            .filter(Objects::nonNull)
            .map(this::entityToDTO)
            .collect(Collectors.toList());
    }

    public SubjectDTO entityToDTO(Subject subject) {
        return new SubjectDTO(subject);
    }

    public List<Subject> DTOsToEntities(List<SubjectDTO> subjectDTOS) {
        return subjectDTOS.stream()
            .filter(Objects::nonNull)
            .map(this::DTOtoEntity)
            .collect(Collectors.toList());
    }

    public Subject DTOtoEntity(SubjectDTO subjectDTO) {
        if (subjectDTO == null) {
            return null;
        } else {
            Subject subject = new Subject();
            subject.setId(subject.getId());
            subject.setName(subject.getName());
            subject.setCredit(subject.getCredit());
            return subject;
        }
    }
}
