package dev.springai.mcp.server.duffel.config;

import dev.springai.mcp.server.duffel.mcp.tooling.flight.CityIataLookup;
import dev.springai.mcp.server.duffel.mcp.tooling.flight.FlightServiceTool;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@RequiredArgsConstructor
public class McpServerConfig {

    private final FlightServiceTool flightServiceTool;

    private final CityIataLookup cityIataLookup;

    @Bean
    public ToolCallbackProvider flightServiceToolCallback() {
        return MethodToolCallbackProvider.builder()
                .toolObjects(flightServiceTool, cityIataLookup)
                .build();
    }
}
