package sejong.hakathon.noti.api.department.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import sejong.hakathon.noti.api.common.dto.APISuccessResponse;
import sejong.hakathon.noti.api.department.dto.response.DepartmentsInformationResponse;

@Tag(name = "[Department API] 학과 관련 API")
public interface DepartmentControllerSwagger {

    @Operation(summary = "대학교 학과 조회 API", description = "해당 대학교에 있는 학과를 조회하는 API입니다.")
    public ResponseEntity<APISuccessResponse<DepartmentsInformationResponse>> getDepartmentsInformation(

    );
}
