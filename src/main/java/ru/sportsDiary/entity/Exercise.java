package ru.sportsDiary.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exerciseID;

    @Column(name = "name", nullable = false)
    private String exersise_name;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private ExerciseType type;

    @ManyToOne
    @JoinColumn(name = "programID")
    private Program program;

    public enum ExerciseType {
        CARDIO,
        STRENGTH
    }
}
