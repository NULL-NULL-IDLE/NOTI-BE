package sejong.hakathon.noti.api.university.dto.response;

public record UniversityInformationResponse(
        Long id,
        String name
) {

    public static UniversityInformationResponse of(final Long id, final String name) {
        return new UniversityInformationResponse(id, name);
    }
}
