package sejong.hakathon.noti.api.department.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sejong.hakathon.noti.api.department.dto.response.DepartmentInformationResponse;
import sejong.hakathon.noti.db.department.repository.DepartmentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Transactional(readOnly = true)
    public List<DepartmentInformationResponse> getDepartmentsInformation(final Long universityId) {
        return departmentRepository.findAllByUniversityId(universityId).stream()
                .map(department -> DepartmentInformationResponse.of(department.getId(), department.getName()))
                .toList();
    }
}
