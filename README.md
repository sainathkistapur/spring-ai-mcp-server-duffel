# Spring AI MCP Server for Duffel Travel

[Duffel Travel](https://duffel.com/)

Application to demonstrate the Spring AI implementation for the MCP server for the Duffel integration. 
The LLM's can directly talk to this MCP server for making any travel arrangements. 

Offers two kinds of MCP tooling:
- Get the IATA code for the given city
- Make a flight booking from origin and destination for a given date.

## Running the Application 
- Make sure you've registered with the Duffel API. Free for testing purpose.
- Obtain the API key from your Duffel account

### Run Command
```
mvn spring-boot:run -Dspring-boot.run.arguments="--DUFFEL_AP_KEY=<your-duffel-api-key>"
```
Replace the "<your-duffel-api-key>" placeholder with your actual Duffel API Key.

### How the application works:

The application is providing MCP SSE server capabilities for the clients using HTTP (WebMvc) protocol.

The SSE endpoint is: `http://localhost:8083`

### Currently supports travel between only these cities:

- New York
- Berlin
- Dubai
- Chicago
- Singapore
- Dallas
- Miami
- Seattle
- Las Vegas
- London
- Delhi



