package com.github.ywilkof.propertiesexample;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "system")
public class SystemProperties {

    private List<Locator> locators;

    public List<Locator> getLocators() {
        return locators;
    }

    public void setLocators(List<Locator> locators) {
        this.locators = locators;
    }

    public static class Locator {
        private String name;
        private List<String> ports;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getPorts() {
            return ports;
        }

        public void setPorts(List<String> ports) {
            this.ports = ports;
        }

        @Override
        public String toString() {
            return "Locator{" +
                    "name='" + name + '\'' +
                    ", ports=" + ports +
                    '}';
        }
    }



}
