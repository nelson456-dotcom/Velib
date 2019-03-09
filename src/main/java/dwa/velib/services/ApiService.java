package dwa.velib.services;

import dwa.velib.domain.Station;

import java.util.List;

public interface ApiService {
    List<Station> getStations();
}
