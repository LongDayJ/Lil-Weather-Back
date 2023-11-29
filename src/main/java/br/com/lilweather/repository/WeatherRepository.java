package br.com.lilweather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.lilweather.clima.Weather;

public interface WeatherRepository extends JpaRepository<Weather, Long> {
    
}