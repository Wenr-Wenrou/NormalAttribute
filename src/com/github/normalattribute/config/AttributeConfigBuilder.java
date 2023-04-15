package com.github.normalattribute.config;

import com.github.normalattribute.NormalAttributeNew;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class AttributeConfigBuilder {
    private static YamlConfiguration attributesConfig;

    public void loadAttributesConfig() {
        File file = new File(NormalAttributeNew.getInstance().getDataFolder(), "attributes.yml");
        if (!file.exists()) {
            NormalAttributeNew.getInstance().saveResource("attributes.yml", false);
        }
        try {
            attributesConfig.load(file);
        } catch (IOException | InvalidConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
    public static YamlConfiguration getAttributeConfig() {
        if (attributesConfig != null)
            return attributesConfig;
        return new YamlConfiguration();
    }
}
