package ru.sportsDiary.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "exercise", schema = "sports_diary")
@NoArgsConstructor
@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exerciseID;

    @Column(name = "name", nullable = false)
    private String exerciseName;  // Исправлено название переменной

    @Column(name = "description")  // Указан атрибут name, а не description
    private String description;

    @Column(name = "muscle_group")  // Правильное использование атрибута name
    private String muscleGroup;  // Название переменной приведено к camelCase

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private ExerciseType type;

    public enum ExerciseType {
        CARDIO,
        STRENGTH
    }
}
