package br.com.lilweather.dto;

import br.com.lilweather.clima.Weather;

public record WeatherListDTO(
        String cityName,
        String cityCountry,
        String main,
        String description,
        String timer

) {
    public WeatherListDTO(Weather weather) {
        this(weather.getCityName(), 
            weather.getCityCountry(), 
            weather.getMain(), 
            weather.getDescription(), 
            weather.getTimer());
    }
}
