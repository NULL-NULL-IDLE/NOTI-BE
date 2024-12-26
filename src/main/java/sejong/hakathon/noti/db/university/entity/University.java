package sejong.hakathon.noti.db.university.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
public class University {

    private final Long id;
    private final String name;

    @Builder
    public University(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
