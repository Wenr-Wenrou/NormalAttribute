package com.github.normalattribute;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AttributeImpl implements Attribute {
    private final String name;
    private final double defaultValue;
    private double value;
    private final List<AttributeCondition> conditions = new ArrayList<>();
    private GlobalCondition globalCondition;

    public AttributeImpl(String name, double defaultValue) {
        this.name = name;
        this.defaultValue = defaultValue;
        this.value = defaultValue;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getDefaultValue() {
        return defaultValue;
    }

    @Override
    public double getValue(Player player) {
        if (globalCondition != null && !globalCondition.check(player)) {
            return defaultValue;
        }
        for (AttributeCondition condition : conditions) {
            if (!condition.check(player)) {
                return defaultValue;
            }
        }
        return value;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public void addCondition(AttributeCondition condition) {
        conditions.add(condition);
    }

    @Override
    public List<AttributeCondition> getConditions() {
        return Collections.unmodifiableList(conditions);
    }

    @Override
    public GlobalCondition getGlobalCondition() {
        return globalCondition;
    }

    @Override
    public void setGlobalCondition(GlobalCondition condition) {
        this.globalCondition = condition;
    }
}
