package ru.sportsDiary.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "months", schema = "sports_diary")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Month {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "month_id")
    private Long monthId;

    @Column(name = "name_month", nullable = false)
    private String nameMonth;
}
