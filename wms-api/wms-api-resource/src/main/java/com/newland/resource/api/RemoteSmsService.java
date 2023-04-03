package com.newland.resource.api;

import com.newland.common.core.exception.ServiceException;
import com.newland.resource.api.domain.SysFile;
import com.newland.resource.api.domain.SysSms;

import java.util.Map;

/**
 * 短信服务
 *
 * @author newland
 */
public interface RemoteSmsService {

    /**
     * 发送短信
     *
     * @param phones     电话号(多个逗号分割)
     * @param templateId 模板id
     * @param param      模板对应参数
     */
    SysSms send(String phones, String templateId, Map<String, String> param) throws ServiceException;

}
