package sejong.hakathon.noti.api.university.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

public record UniversityInformationResponse(
        @Schema(description = "대학교 id", example = "1")
        Long id,
        @Schema(description = "대학교 이름", example = "세종대학교")
        String name
) {

    public static UniversityInformationResponse of(final Long id, final String name) {
        return new UniversityInformationResponse(id, name);
    }
}
