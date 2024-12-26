package sejong.hakathon.noti.api.university.dto.response;

import java.util.List;

public record UniversitiesInformationResponse(
        List<UniversityInformationResponse> universities
) {

    public static UniversitiesInformationResponse of(final List<UniversityInformationResponse> universities) {
        return new UniversitiesInformationResponse(universities);
    }
}
