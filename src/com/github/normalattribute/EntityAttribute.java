package com.github.normalattribute;

import org.bukkit.entity.EntityType;

public class EntityAttribute {
    private final EntityType entityType;
    private final String attributeName;
    private final String displayName;
    private final String description;
    private final Attribute attribute;

    public EntityAttribute(EntityType entityType, String attributeName, String displayName,
                           String description, Attribute attribute) {
        this.entityType = entityType;
        this.attributeName = attributeName;
        this.displayName = displayName;
        this.description = description;
        this.attribute = attribute;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDescription() {
        return description;
    }

    public Attribute getAttribute() {
        return attribute;
    }
}
