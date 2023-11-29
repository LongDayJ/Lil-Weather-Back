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
    private double temp1;
    private int humidity1;
    private String weather1;
    private String description1;
    private String timer1;
    private double temp2;
    private int humidity2;
    private String weather2;
    private String description2;
    private String timer2;
    private double temp3;
    private int humidity3;
    private String weather3;
    private String description3;
    private String timer3;
    private double temp4;
    private int humidity4;
    private String weather4;
    private String description4;
    private String timer4;
    private double temp5;
    private int humidity5;
    private String weather5;
    private String description5;
    private String timer5;
    private double temp6;
    private int humidity6;
    private String weather6;
    private String description6;
    private String timer6;
    private double temp7;
    private int humidity7;
    private String weather7;
    private String description7;
    private String timer7;
    private double temp8;
    private int humidity8;
    private String weather8;
    private String description8;
    private String timer8;
    private double temp9;
    private int humidity9;
    private String weather9;
    private String description9;
    private String timer9;

    public Weather(WeatherInsertDTO dto) {
        this.cityName = dto.cityName();
        this.cityCountry = dto.cityCountry();
        this.temp1 = dto.temp1();
        this.humidity1 = dto.humidity1();
        this.weather1 = dto.weather1();
        this.description1 = dto.description1();
        this.timer1 = dto.timer1();
        this.temp2 = dto.temp2();
        this.humidity2 = dto.humidity2();
        this.weather2 = dto.weather2();
        this.description2 = dto.description2();
        this.timer2 = dto.timer2();
        this.temp3 = dto.temp3();
        this.humidity3 = dto.humidity3();
        this.weather3 = dto.weather3();
        this.description3 = dto.description3();
        this.timer3 = dto.timer3();
        this.temp4 = dto.temp4();
        this.humidity4 = dto.humidity4();
        this.weather4 = dto.weather4();
        this.description4 = dto.description4();
        this.timer4 = dto.timer4();
        this.temp5 = dto.temp5();
        this.humidity5 = dto.humidity5();
        this.weather5 = dto.weather5();
        this.description5 = dto.description5();
        this.timer5 = dto.timer5();
        this.temp6 = dto.temp6();
        this.humidity6 = dto.humidity6();
        this.weather6 = dto.weather6();
        this.description6 = dto.description6();
        this.timer6 = dto.timer6();
        this.temp7 = dto.temp7();
        this.humidity7 = dto.humidity7();
        this.weather7 = dto.weather7();
        this.description7 = dto.description7();
        this.timer7 = dto.timer7();
        this.temp8 = dto.temp8();
        this.humidity8 = dto.humidity8();
        this.weather8 = dto.weather8();
        this.description8 = dto.description8();
        this.timer8 = dto.timer8();
        this.temp9 = dto.temp9();
        this.humidity9 = dto.humidity9();
        this.weather9 = dto.weather9();
        this.description9 = dto.description9();
        this.timer9 = dto.timer9();
    }
}
