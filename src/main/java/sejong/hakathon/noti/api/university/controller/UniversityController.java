package sejong.hakathon.noti.api.university.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sejong.hakathon.noti.api.common.dto.APISuccessResponse;
import sejong.hakathon.noti.api.university.dto.response.UniversitiesInformationResponse;
import sejong.hakathon.noti.api.university.service.UniversityService;

@RestController
@RequestMapping("/api/v1/universities")
@RequiredArgsConstructor
public class UniversityController implements UniversityControllerSwagger {

    private final UniversityService universityService;

    @GetMapping
    public ResponseEntity<APISuccessResponse<UniversitiesInformationResponse>> getUniversitiesInformation() {
        return APISuccessResponse.of(HttpStatus.OK, UniversitiesInformationResponse.of(universityService.getUniversitiesInformation()));
    }
}
