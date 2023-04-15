package com.github.normalattribute;

import org.bukkit.entity.Player;

public class AttributeCondition implements Condition {
    private final String name;

    public AttributeCondition(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean check(Player player) {
        // TODO: 实现你的逻辑
        return true;
    }
}
