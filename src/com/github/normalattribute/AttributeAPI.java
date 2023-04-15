package com.github.normalattribute;

import java.util.*;

public class AttributeAPI {

    private final Map<String, Attribute> attributes = new HashMap<>();
    private final List<GlobalCondition> globalConditions = new ArrayList<>();
    private final Map<String, AttributeFormat> attributeFormats = new HashMap<>();

    public Attribute createAttribute(String name, double defaultValue) {
        Attribute attribute = new AttributeImpl(name, defaultValue);
        attributes.put(name, attribute);
        return attribute;
    }

    public Attribute getAttribute(String name) {
        return attributes.get(name);
    }

    public void removeAttribute(String name) {
        attributes.remove(name);
    }

    public List<Attribute> getAttributes() {
        return new ArrayList<>(attributes.values());
    }

    public GlobalCondition createGlobalCondition(String name) {
        GlobalCondition condition = new GlobalCondition(name);
        globalConditions.add(condition);
        return condition;
    }

    public void removeGlobalCondition(GlobalCondition condition) {
        globalConditions.remove(condition);
    }

    public List<GlobalCondition> getGlobalConditions() {
        return Collections.unmodifiableList(globalConditions);
    }

    public void registerDefaultAttributeFormats() {
        // TODO: 实现逻辑
    }

    public void registerAttributeFormat(String name, AttributeFormat format) {
        attributeFormats.put(name, format);
    }

    public AttributeFormat getAttributeFormat(String name) {
        return attributeFormats.get(name);
    }
}
