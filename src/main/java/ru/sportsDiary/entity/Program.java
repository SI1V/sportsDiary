package ru.sportsDiary.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс Program представляет сущность "Программа тренировок" в базе данных.
 * Он использует аннотации JPA для определения таблицы в базе данных и полей таблицы.
 *
 * @author S-i1-V
 * @version 1.0
 */
@Entity
@Table(name = "program", schema = "sports_diary")
@Data
@NoArgsConstructor
public class Program {

    /**
     * Поле programID представляет уникальный идентификатор программы тренировок.
     * Оно является первичным ключом и генерируется автоматически при создании новой программы тренировок.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long programID;

    /**
     * Поле program_name представляет название программы тренировок.
     * Оно не может быть null.
     */
    @Column(name = "name", nullable = false)
    private String program_name;

    /**
     * Поле program_description представляет описание программы тренировок.
     * Оно не может быть null.
     */
    @Column(name = "description", nullable = false)
    private String program_description;

    /**
     * Поле athlete представляет связь с классом Athlete (атлет).
     * Это поле является внешним ключом, который связывает программу тренировок с конкретным атлетом.
     */
    @ManyToOne
    @JoinColumn(name = "athleteID")
    private Athlete athlete;
}
