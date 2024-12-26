package sejong.hakathon.noti.db.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sejong.hakathon.noti.db.university.entity.University;

public interface UniversityRepository extends JpaRepository<University, Long> {
}
