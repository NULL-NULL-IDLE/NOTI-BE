package sejong.hakathon.noti.db.university.repository;

import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sejong.hakathon.noti.db.university.entity.University;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UniversityRepository {

    private final DSLContext dslContext;

    @Transactional(readOnly = true)
    public List<University> getUniversities() {
        return dslContext.select()
                .from(UNIVERSITY)
                .fetch(University.class);
    }

}
