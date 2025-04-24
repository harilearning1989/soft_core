package com.web.soft.config;

import org.springframework.context.support.AbstractMessageSource;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Map;

public class YamlMessageSource extends AbstractMessageSource {

    private final Map<String, Object> messages;

    public YamlMessageSource(String basename) {
        Yaml yaml = new Yaml();
        try (InputStream in = getClass().getClassLoader().getResourceAsStream(basename + ".yaml")) {
            this.messages = yaml.load(in);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load YAML messages", e);
        }
    }

    @Override
    protected MessageFormat resolveCode(String code, Locale locale) {
        String[] parts = code.split("\\.");
        Object value = messages;
        for (String part : parts) {
            if (value instanceof Map<?, ?> map) {
                value = map.get(part);
            } else {
                value = null;
                break;
            }
        }

        if (value instanceof String message) {
            return new MessageFormat(message, locale);
        }

        return null;
    }
}

