package sejong.hakathon.noti.api.department.dto.response;

import java.util.List;

public record DepartmentsInformationResponse(
        List<DepartmentInformationResponse> departments
) {

    public static DepartmentsInformationResponse of(final List<DepartmentInformationResponse> departments) {
        return new DepartmentsInformationResponse(departments);
    }
}
