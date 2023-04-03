package com.newland.common.translation.annotation;

import java.lang.annotation.*;

/**
 * 翻译类型注解 (标注到{@link com.newland.common.translation.core.TranslationInterface} 的实现类)
 *
 * @author newland
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
public @interface TranslationType {

    /**
     * 类型
     */
    String type();

}
