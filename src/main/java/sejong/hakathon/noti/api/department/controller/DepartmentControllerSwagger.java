package sejong.hakathon.noti.api.department.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import sejong.hakathon.noti.api.common.dto.APISuccessResponse;
import sejong.hakathon.noti.api.department.dto.response.DepartmentsInformationResponse;

@Tag(name = "[Department API] 학과 관련 API")
public interface DepartmentControllerSwagger {

    @Operation(summary = "대학교 학과 조회 API", description = "해당 대학교에 있는 학과를 조회하는 API입니다.")
    @Parameter(name = "universityId", description = "대학교 아이디", in = ParameterIn.PATH, required = true, schema = @Schema(type = "Integer"))
    public ResponseEntity<APISuccessResponse<DepartmentsInformationResponse>> getDepartmentsInformation(
            @PathVariable(name = "universityId") final Long universityId
    );
}
