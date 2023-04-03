package com.newland.common.translation.core;

/**
 * 翻译接口 (实现类需标注 {@link com.newland.common.translation.annotation.TranslationType} 注解标明翻译类型)
 *
 * @author newland
 */
public interface TranslationInterface<T> {

    /**
     * 翻译
     *
     * @param key 需要被翻译的键(不为空)
     * @return 返回键对应的值
     */
    T translation(Object key, String other);
}
