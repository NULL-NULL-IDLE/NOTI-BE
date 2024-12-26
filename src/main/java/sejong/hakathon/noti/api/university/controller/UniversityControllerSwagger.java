package sejong.hakathon.noti.api.university.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import sejong.hakathon.noti.api.common.dto.APISuccessResponse;
import sejong.hakathon.noti.api.university.dto.response.UniversitiesInformationResponse;

@Tag(name = "[University API] 대학교 관련 API")
public interface UniversityControllerSwagger {

    @Operation(summary = "대학교 조회 API", description = "대학교를 조회하는 API입니다.")
    @Parameter(name = "universityId", description = "대학교 아이디", in = ParameterIn.PATH, required = true, schema = @Schema(type = "Integer"))
    public ResponseEntity<APISuccessResponse<UniversitiesInformationResponse>> getUniversitiesInformations();
}
