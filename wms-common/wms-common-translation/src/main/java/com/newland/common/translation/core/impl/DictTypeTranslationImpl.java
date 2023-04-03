package com.newland.common.translation.core.impl;

import com.newland.common.core.service.DictService;
import com.newland.common.core.utils.StringUtils;
import com.newland.common.translation.annotation.TranslationType;
import com.newland.common.translation.constant.TransConstant;
import com.newland.common.translation.core.TranslationInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 字典翻译实现
 *
 * @author newland
 */
@AllArgsConstructor
@TranslationType(type = TransConstant.DICT_TYPE_TO_LABEL)
public class DictTypeTranslationImpl implements TranslationInterface<String> {

    private final DictService dictService;

    public String translation(Object key, String other) {
        if (key instanceof String && StringUtils.isNotBlank(other)) {
            return dictService.getDictLabel(other, key.toString());
        }
        return null;
    }
}
