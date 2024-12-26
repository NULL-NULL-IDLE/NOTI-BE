package sejong.hakathon.noti.db.faq.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
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
}
