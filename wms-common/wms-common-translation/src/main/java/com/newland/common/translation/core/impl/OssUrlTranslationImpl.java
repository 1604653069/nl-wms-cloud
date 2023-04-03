package com.newland.common.translation.core.impl;

import com.newland.common.translation.annotation.TranslationType;
import com.newland.common.translation.constant.TransConstant;
import com.newland.common.translation.core.TranslationInterface;
import com.newland.resource.api.RemoteFileService;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

/**
 * OSS翻译实现
 *
 * @author newland
 */
@AllArgsConstructor
@TranslationType(type = TransConstant.OSS_ID_TO_URL)
public class OssUrlTranslationImpl implements TranslationInterface<String> {

    @DubboReference
    private RemoteFileService ossService;

    public String translation(Object key, String other) {
        return ossService.selectUrlByIds(key.toString());
    }
}
