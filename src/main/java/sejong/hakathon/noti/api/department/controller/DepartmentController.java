package sejong.hakathon.noti.api.department.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sejong.hakathon.noti.api.common.dto.APISuccessResponse;
import sejong.hakathon.noti.api.department.dto.response.DepartmentsInformationResponse;
import sejong.hakathon.noti.api.department.service.DepartmentService;

@RestController
@RequestMapping("/api/v1/departments")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping("/{universityId}")
    public ResponseEntity<APISuccessResponse<DepartmentsInformationResponse>> getDepartmentsInformation(
            @PathVariable(name = "universityId") final Long universityId
    ) {
        return APISuccessResponse.of(HttpStatus.OK, DepartmentsInformationResponse.of(departmentService.getDepartmentsInformation(universityId)));
    }
}
