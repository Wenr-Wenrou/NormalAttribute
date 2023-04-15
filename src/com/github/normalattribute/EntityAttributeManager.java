package com.github.normalattribute;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.*;

public class EntityAttributeManager {

    private final AttributeAPI attributeAPI;
    private final Map<EntityType, List<EntityAttribute>> entityAttributes = new HashMap<>();

    public EntityAttributeManager(AttributeAPI attributeAPI) {
        this.attributeAPI = attributeAPI;
    }

    public void addEntityAttribute(EntityType entityType, String attributeName, String displayName,
                                   String description, Attribute attribute) {
        List<EntityAttribute> attributes = entityAttributes.computeIfAbsent(entityType, k -> new ArrayList<>());
        EntityAttribute entityAttribute = new EntityAttribute(entityType, attributeName, displayName,
                description, attribute);
        attributes.add(entityAttribute);
    }

    public List<EntityAttribute> getEntityAttributes(EntityType entityType) {
        return Collections.unmodifiableList(entityAttributes.getOrDefault(entityType, Collections.emptyList()));
    }

    public double calculateEntityAttributeValue(EntityType entityType, Player player) {
        double value = 0;
        for (EntityAttribute entityAttribute : getEntityAttributes(entityType)) {
            value += entityAttribute.getAttribute().getValue(player);
        }
        return value;
    }
}
