package br.com.lilweather.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.lilweather.clima.Weather;
import br.com.lilweather.dto.WeatherListDTO;
import br.com.lilweather.repository.WeatherRepository;
import br.com.lilweather.utils.Constants;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	@Autowired
	private WeatherRepository repository;

	@GetMapping("/previsao")
	@Transactional
	public Page<WeatherListDTO> insert(@RequestParam("cidade") String cityName,
			@SortDefault(sort = "id", direction = Sort.Direction.DESC) Pageable pageable)
			throws IOException, InterruptedException {

		String nomeTratado = cityName.replace(" ", "+");
		String url = "" + Constants.APIurl + nomeTratado + Constants.APIlang + "&appid=" + Constants.APIkey;

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build(); // BUILDER
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		String json = response.body();

		JSONObject jsonObject = new JSONObject(json);
		JSONArray listArray = jsonObject.getJSONArray("list");
		JSONObject cityObject = jsonObject.getJSONObject("city");

		// for (int i = 0; i < listArray.length(); i = i + 8) {
		// JSONObject listItem = listArray.getJSONObject(i);
		// JSONArray weatherArray = listItem.getJSONArray("weather");
		// JSONObject weatherObject = weatherArray.getJSONObject(0);

		// Weather weatherForecast = new Weather(
		// null,
		// cityObject.getString("name"),
		// cityObject.getString("country"),
		// weatherObject.getString("weather"),
		// weatherObject.getString("description"),
		// listItem.getString("dt_txt"));

		// if (i == 0) {
		// forecastDays[i] = weatherForecast;
		// repository.save(weatherForecast);
		// } else if (i != 0 &&
		// weatherForecast.getTimer().contains(forecastDays[0].getTimer().split("
		// ")[1])) {
		// forecastDays[i / 8] = weatherForecast;
		// repository.save(weatherForecast);
		// }
		// }
		Weather weatherForecast = new Weather();
		weatherForecast.setCityName(cityObject.getString("name"));
		weatherForecast.setCityCountry(cityObject.getString("country"));

		weatherForecast.setTemp1(listArray.getJSONObject(0).getJSONObject("main").getDouble("temp"));
		weatherForecast.setHumidity1(listArray.getJSONObject(0).getJSONObject("main").getInt("humidity"));
		weatherForecast.setWeather1(listArray.getJSONObject(0).getJSONArray("weather").getJSONObject(0).getString("main"));
		weatherForecast.setDescription1(listArray.getJSONObject(0).getJSONArray("weather").getJSONObject(0).getString("description"));
		weatherForecast.setTimer1(listArray.getJSONObject(0).getString("dt_txt"));

		weatherForecast.setTemp2(listArray.getJSONObject(1).getJSONObject("main").getDouble("temp"));
		weatherForecast.setHumidity2(listArray.getJSONObject(1).getJSONObject("main").getInt("humidity"));
		weatherForecast.setWeather2(listArray.getJSONObject(1).getJSONArray("weather").getJSONObject(0).getString("main"));
		weatherForecast.setDescription2(listArray.getJSONObject(1).getJSONArray("weather").getJSONObject(0).getString("description"));
		weatherForecast.setTimer2(listArray.getJSONObject(1).getString("dt_txt"));

		weatherForecast.setTemp3(listArray.getJSONObject(2).getJSONObject("main").getDouble("temp"));
		weatherForecast.setHumidity3(listArray.getJSONObject(2).getJSONObject("main").getInt("humidity"));
		weatherForecast.setWeather3(listArray.getJSONObject(2).getJSONArray("weather").getJSONObject(0).getString("main"));
		weatherForecast.setDescription3(listArray.getJSONObject(2).getJSONArray("weather").getJSONObject(0).getString("description"));
		weatherForecast.setTimer3(listArray.getJSONObject(2).getString("dt_txt"));

		weatherForecast.setTemp4(listArray.getJSONObject(3).getJSONObject("main").getDouble("temp"));
		weatherForecast.setHumidity4(listArray.getJSONObject(3).getJSONObject("main").getInt("humidity"));
		weatherForecast.setWeather4(listArray.getJSONObject(3).getJSONArray("weather").getJSONObject(0).getString("main"));
		weatherForecast.setDescription4(listArray.getJSONObject(3).getJSONArray("weather").getJSONObject(0).getString("description"));
		weatherForecast.setTimer4(listArray.getJSONObject(3).getString("dt_txt"));

		weatherForecast.setTemp5(listArray.getJSONObject(4).getJSONObject("main").getDouble("temp"));
		weatherForecast.setHumidity5(listArray.getJSONObject(4).getJSONObject("main").getInt("humidity"));
		weatherForecast.setWeather5(listArray.getJSONObject(4).getJSONArray("weather").getJSONObject(0).getString("main"));
		weatherForecast.setDescription5(listArray.getJSONObject(4).getJSONArray("weather").getJSONObject(0).getString("description"));
		weatherForecast.setTimer5(listArray.getJSONObject(4).getString("dt_txt"));

		weatherForecast.setTemp6(listArray.getJSONObject(8).getJSONObject("main").getDouble("temp"));
		weatherForecast.setHumidity6(listArray.getJSONObject(8).getJSONObject("main").getInt("humidity"));
		weatherForecast.setWeather6(listArray.getJSONObject(8).getJSONArray("weather").getJSONObject(0).getString("main"));
		weatherForecast.setDescription6(listArray.getJSONObject(8).getJSONArray("weather").getJSONObject(0).getString("description"));
		weatherForecast.setTimer6(listArray.getJSONObject(8).getString("dt_txt"));

		weatherForecast.setTemp7(listArray.getJSONObject(16).getJSONObject("main").getDouble("temp"));
		weatherForecast.setHumidity7(listArray.getJSONObject(16).getJSONObject("main").getInt("humidity"));
		weatherForecast.setWeather7(listArray.getJSONObject(16).getJSONArray("weather").getJSONObject(0).getString("main"));
		weatherForecast.setDescription7(listArray.getJSONObject(16).getJSONArray("weather").getJSONObject(0).getString("description"));
		weatherForecast.setTimer7(listArray.getJSONObject(16).getString("dt_txt"));

		weatherForecast.setTemp8(listArray.getJSONObject(24).getJSONObject("main").getDouble("temp"));
		weatherForecast.setHumidity8(listArray.getJSONObject(24).getJSONObject("main").getInt("humidity"));
		weatherForecast.setWeather8(listArray.getJSONObject(24).getJSONArray("weather").getJSONObject(0).getString("main"));
		weatherForecast.setDescription8(listArray.getJSONObject(24).getJSONArray("weather").getJSONObject(0).getString("description"));
		weatherForecast.setTimer8(listArray.getJSONObject(24).getString("dt_txt"));

		weatherForecast.setTemp9(listArray.getJSONObject(32).getJSONObject("main").getDouble("temp"));
		weatherForecast.setHumidity9(listArray.getJSONObject(32).getJSONObject("main").getInt("humidity"));
		weatherForecast.setWeather9(listArray.getJSONObject(32).getJSONArray("weather").getJSONObject(0).getString("main"));
		weatherForecast.setDescription9(listArray.getJSONObject(32).getJSONArray("weather").getJSONObject(0).getString("description"));
		weatherForecast.setTimer9(listArray.getJSONObject(32).getString("dt_txt"));

		repository.save(weatherForecast);
		
		return repository.findAll(pageable).map(WeatherListDTO::new);
	}

	@GetMapping("/list")
	public List<WeatherListDTO> listar() {
		return repository.findAll().stream().map(WeatherListDTO::new).toList();
	}

	@GetMapping("/historico")
	public Page<WeatherListDTO> historico(Pageable pageable, @RequestParam("page") int page) {
		return repository.findAll(pageable).map(WeatherListDTO::new);
	}

}
