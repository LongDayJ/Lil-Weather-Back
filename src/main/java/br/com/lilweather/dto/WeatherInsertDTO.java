package br.com.lilweather.dto;

import jakarta.validation.constraints.NotBlank;

public record WeatherInsertDTO(

        @NotBlank
        String cityName,

        @NotBlank
        String cityCountry,

        @NotBlank
        String main,

        @NotBlank
        String description,

        @NotBlank
        String timer
) {
    
}
