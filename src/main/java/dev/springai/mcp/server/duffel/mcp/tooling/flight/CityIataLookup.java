package dev.springai.mcp.server.duffel.mcp.tooling.flight;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class CityIataLookup {

    private Map<String, String> cityIataMap = new HashMap<>();


    @PostConstruct
    public void initializeMap() {
        cityIataMap.put("New York", "NYC");
        cityIataMap.put("Berlin", "BER");
        cityIataMap.put("Dubai", "DXB");
        cityIataMap.put("Chicago", "ORD");
        cityIataMap.put("Singapore", "SIN");
        cityIataMap.put("Dallas", "DFW");
        cityIataMap.put("Miami", "MIA");
        cityIataMap.put("Denver", "DEN");
        cityIataMap.put("Seattle", "SEA");
        cityIataMap.put("Las Vegas", "LAS");
        cityIataMap.put("London", "LON");
        cityIataMap.put("Delhi", "DEL");
    }

    /**
     * Add a new city-IATA mapping to the map.
     * @param city the city name
     * @param iataCode the IATA code
     */
    public void addCity(String city, String iataCode) {
        cityIataMap.put(city, iataCode);
    }

    /**
     * Get the IATA code for a given city.
     * @param city the city name
     * @return the IATA code or null if not found
     */
    @Tool(name = "getIataCode", description = "Get or Find IATA code for a given city.")
    public String getIataCode(String city) {
        return cityIataMap.getOrDefault(city, "Unknown");
    }

    /**
     * Check if a city exists in the map.
     * @param city the city name
     * @return true if the city is present, false otherwise
     */
    public boolean hasCity(String city) {
        return cityIataMap.containsKey(city);
    }

    /**
     * Get the entire map of city-IATA pairs.
     * @return the city-IATA map
     */
    public Map<String, String> getCityIataMap() {
        return cityIataMap;
    }
}
