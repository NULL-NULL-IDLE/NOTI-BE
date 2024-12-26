package sejong.hakathon.noti.api.university.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sejong.hakathon.noti.api.university.dto.response.UniversityInformationResponse;
import sejong.hakathon.noti.db.university.repository.UniversityRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UniversityService {

    private final UniversityRepository universityRepository;

    @Transactional(readOnly = true)
    public List<UniversityInformationResponse> getUniversitiesInformations() {
        return universityRepository.findAll().stream()
                .map(university -> UniversityInformationResponse.of(university.getId(), university.getName()))
                .toList();
    }
}
