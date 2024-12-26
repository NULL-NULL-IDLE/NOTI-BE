package sejong.hakathon.noti.api.department.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

public record DepartmentInformationResponse(
        @Schema(description = "학과 id", example = "1")
        Long id,
        @Schema(description = "학과 이름", example = "컴퓨터공학과")
        String name
) {

    public static DepartmentInformationResponse of(final Long id, final String name) {
        return new DepartmentInformationResponse(id, name);
    }
}
