package com.github.normalattribute;

public interface AttributeFormat {
    /**
     * 从字符串中解析出属性对象。
     *
     * @param value 字符串。
     * @return 属性对象。
     */
    Attribute parse(String value);

    /**
     * 将属性对象转换为字符串表示。
     *
     * @param attribute 属性对象。
     * @return 字符串表示。
     */
    String format(Attribute attribute);
}
