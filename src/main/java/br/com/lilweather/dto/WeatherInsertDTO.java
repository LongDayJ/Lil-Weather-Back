package br.com.lilweather.dto;

import jakarta.validation.constraints.NotBlank;

public record WeatherInsertDTO(

        @NotBlank
        String cityName,
        @NotBlank
        String cityCountry,
        @NotBlank
        double temp1,
        @NotBlank
        int humidity1,
        @NotBlank
        String weather1,
        @NotBlank
        String description1,
        @NotBlank
        String timer1,
        @NotBlank
        double temp2,
        @NotBlank
        int humidity2,
        @NotBlank
        String weather2,
        @NotBlank
        String description2,
        @NotBlank
        String timer2,
        @NotBlank
        double temp3,
        @NotBlank
        int humidity3,
        @NotBlank
        String weather3,
        @NotBlank
        String description3,
        @NotBlank
        String timer3,
        @NotBlank
        double temp4,
        @NotBlank
        int humidity4,
        @NotBlank
        String weather4,
        @NotBlank
        String description4,
        @NotBlank
        String timer4,
        @NotBlank
        double temp5,
        @NotBlank
        int humidity5,
        @NotBlank
        String weather5,
        @NotBlank
        String description5,
        @NotBlank
        String timer5,
        @NotBlank
        double temp6,
        @NotBlank
        int humidity6,
        @NotBlank
        String weather6,
        @NotBlank
        String description6,
        @NotBlank
        String timer6,
        @NotBlank
        double temp7,
        @NotBlank
        int humidity7,
        @NotBlank
        String weather7,
        @NotBlank
        String description7,
        @NotBlank
        String timer7,
        @NotBlank
        double temp8,
        @NotBlank
        int humidity8,
        @NotBlank
        String weather8,
        @NotBlank
        String description8,
        @NotBlank
        String timer8,
        @NotBlank
        double temp9,
        @NotBlank
        int humidity9,
        @NotBlank
        String weather9,
        @NotBlank
        String description9,
        @NotBlank
        String timer9
) {
    
}
