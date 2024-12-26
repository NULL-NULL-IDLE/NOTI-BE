package sejong.hakathon.noti.db.university.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint", nullable = false)
    private Long id;

    @Column(name = "name", columnDefinition = "varchar(25)", nullable = false)
    private String name;

    @Builder
    public University(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
