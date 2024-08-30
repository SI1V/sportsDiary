package ru.sportsDiary.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Класс Workout представляет сущность "Тренировка" в базе данных.
 * Он использует аннотации JPA для определения таблицы в базе данных и полей таблицы.
 *
 * @author Ivanov Ivan
 * @version 1.0
 */
@Entity
@Table(name = "workout", schema = "sports_diary")
@Data
@NoArgsConstructor
public class Workout {

    /**
     * Поле workoutID представляет уникальный идентификатор тренировки.
     * Оно является первичным ключом и генерируется автоматически при создании новой тренировки.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workoutID;

    /**
     * Поле workout_date представляет дату проведения тренировки.
     * Оно не может быть null.
     */
    @Column(name = "date", nullable = false)
    private Date workout_date;

    /**
     * Поле workout_duration представляет продолжительность тренировки в минутах.
     * Оно не может быть null.
     */
    @Column(name = "duration", nullable = false)
    private Integer workout_duration;

    /**
     * Поле workout_type представляет тип тренировки (например, "бег", "плавание", "йога" и т.д.).
     * Оно не может быть null.
     */
    @Column(name = "type", nullable = false)
    private String workout_type;

    /**
     * Поле workout_description представляет описание тренировки.
     * Оно не может быть null.
     */
    @Column(name = "description", nullable = false)
    private String workout_description;

    /**
     * Поле athlete представляет связь с классом Athlete (атлет).
     * Это поле является внешним ключом, который связывает тренировку с конкретным атлетом.
     */
    @ManyToOne
    @JoinColumn(name = "athleteID")
    private Athlete athlete;
}


