package asd;

import framework.annotation.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public class AppConfig {
    private String name;
    private int version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "AppConfig{name='" + name + "', version=" + version + "}";
    }
}
