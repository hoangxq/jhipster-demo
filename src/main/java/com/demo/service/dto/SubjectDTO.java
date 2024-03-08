package com.demo.service.dto;

import com.demo.domain.Subject;
import lombok.Data;

@Data
public class SubjectDTO {
    private Long id;
    private String name;
    private Integer credit;

    public SubjectDTO(Subject subject) {
        this.id = subject.getId();
        this.name = subject.getName();
        this.credit = subject.getCredit();
    }
}
