package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties",
        "classpath:dev.properties"
})
public interface TestPropertiesConfig extends org.aeonbits.owner.Config {
    @Key("baseUrl")
    String getBaseUrl();

    @Key("apiKey")
    String getApiKey();
}
