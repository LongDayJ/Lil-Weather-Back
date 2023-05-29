package br.com.lilweather.clima;

import br.com.lilweather.dto.WeatherInsertDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Table(name = "weathers")
@Entity(name = "Weather")
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cityName;
    private String cityCountry;
    private String main;
    private String description;
    private String timer;

    public Weather(WeatherInsertDTO dto) {
        this.cityName = dto.cityName();
        this.cityCountry = dto.cityCountry();
        this.main = dto.main();
        this.description = dto.description();
        this.timer = dto.timer();
    }

}
