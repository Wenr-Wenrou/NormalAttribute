package com.github.normalattribute;

import org.bukkit.entity.Player;

public interface Condition {

    /**
     * 获取条件名称。
     *
     * @return 条件名称。
     */
    String getName();

    /**
     * 检查指定玩家是否满足条件。
     *
     * @param player 玩家。
     * @return 如果玩家满足条件则为 true，否则为 false。
     */
    boolean check(Player player);

}
