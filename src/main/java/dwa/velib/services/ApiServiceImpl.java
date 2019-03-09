package dwa.velib.services;

import dwa.velib.domain.Station;
import dwa.velib.domain.StationData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;
    private final String api_url;

    public ApiServiceImpl(RestTemplate restTemplate, @Value("https://opendata.paris.fr/api/records/1.0/search/?dataset=velib-disponibilite-en-temps-reel&rows=68&sort=lat") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }

    @Override
    public List<Station> getStations() {
        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromUriString(api_url);

        StationData stationData = restTemplate.getForObject(
                uriComponentsBuilder.toUriString(),
                StationData.class);
        List<Station> stations = stationData.getRecords();
        return stationData.getRecords();
    }
}
