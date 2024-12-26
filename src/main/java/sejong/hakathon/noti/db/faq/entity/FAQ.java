package sejong.hakathon.noti.db.faq.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "faq")
public class FAQ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "title", columnDefinition = "varchar(25)")
    String title;

    @Column(name = "content", columnDefinition = "varchar(25)")
    String content;

    @Column(name = "semester", columnDefinition = "varchar(25)")
    String semester;

    @Column(name = "category", columnDefinition = "varchar(25)")
    String category;

    @Column(name = "entry_year", columnDefinition = "int")
    int entryYear;

    @Column(name = "update_at", columnDefinition = "varchar(25)")
    LocalDateTime updatedAt;

    @Builder
    public FAQ(Long id, String title, String content, String semester, String category, int entryYear, LocalDateTime updatedAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.semester = semester;
        this.category = category;
        this.entryYear = entryYear;
        this.updatedAt = updatedAt;
    }
}
