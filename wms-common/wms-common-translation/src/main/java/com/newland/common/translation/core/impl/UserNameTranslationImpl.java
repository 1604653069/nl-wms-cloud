package com.newland.common.translation.core.impl;

import com.newland.common.translation.annotation.TranslationType;
import com.newland.common.translation.constant.TransConstant;
import com.newland.common.translation.core.TranslationInterface;
import com.newland.system.api.RemoteUserService;
import lombok.AllArgsConstructor;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

/**
 * 用户名翻译实现
 *
 * @author newland
 */
@AllArgsConstructor
@TranslationType(type = TransConstant.USER_ID_TO_NAME)
public class UserNameTranslationImpl implements TranslationInterface<String> {

    @DubboReference
    private RemoteUserService remoteUserService;

    public String translation(Object key, String other) {
        return remoteUserService.selectUserNameById((Long) key);
    }
}
