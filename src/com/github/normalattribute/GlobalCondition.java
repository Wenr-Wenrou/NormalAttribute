package com.github.normalattribute;

import com.github.normalattribute.Condition;
import org.bukkit.entity.Player;

public class GlobalCondition implements Condition {
    private final String name;

    public GlobalCondition(String name) {
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
