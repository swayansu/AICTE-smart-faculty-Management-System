package org.aicte.sih.SIHProject.api.faculty.dto.Request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FacultyLeavingRequest {
    private Long facultyId;
    private Long collegeId;
    private String dateOfLeaving;
}
