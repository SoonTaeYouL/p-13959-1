package com.mysite.sbb;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;


    @Column(columnDefinition = "TEXT")
    private String content;
}
