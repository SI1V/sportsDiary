package ru.sportsDiary.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class SportsmanResponse {

    private Long id;
    private String lastName;
    private String firstName;
    private String middleName;
    private Date birthDate;
    private float height;
    private float weight;
}
