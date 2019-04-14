package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/weather")
public class WeatherController {

	@RequestMapping("/city")
	public String show(@RequestParam ("city") String city) {
	HttpResponse<JsonNode> response = Unirest.get("http://api.openweathermap.org/data/2.5/weather")/
                            .queryString("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22")
                            .queryString("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22",city)
                            .header("content-type","application/json")
                            .asJson();

}


}


