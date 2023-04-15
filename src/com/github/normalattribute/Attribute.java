package com.github.normalattribute;

import org.bukkit.entity.Player;

import java.util.List;

public interface Attribute {

    /**
     * 获取属性名称。
     *
     * @return 属性名称。
     */
    String getName();

    /**
     * 获取属性默认值。
     *
     * @return 属性默认值。
     */
    double getDefaultValue();

    /**
     * 获取指定玩家的属性值。
     *
     * @param player 玩家。
     * @return 属性值。
     */
    double getValue(Player player);

    /**
     * 设置属性值。
     *
     * @param value 属性值。
     */
    void setValue(double value);

    /**
     * 添加属性条件。
     *
     * @param condition 属性条件。
     */
    void addCondition(AttributeCondition condition);

    /**
     * 获取属性条件列表。
     *
     * @return 属性条件列表。
     */
    List<AttributeCondition> getConditions();

    /**
     * 获取全局条件。
     *
     * @return 全局条件。
     */
    GlobalCondition getGlobalCondition();

    /**
     * 设置全局条件。
     *
     * @param condition 全局条件。
     */
    void setGlobalCondition(GlobalCondition condition);
}
