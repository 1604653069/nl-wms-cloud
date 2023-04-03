package com.newland.resource.dubbo;

import cn.hutool.core.bean.BeanUtil;
import com.newland.common.core.exception.ServiceException;
import com.newland.common.core.utils.SpringUtils;
import com.newland.common.sms.config.properties.SmsProperties;
import com.newland.common.sms.core.SmsTemplate;
import com.newland.common.sms.entity.SmsResult;
import com.newland.resource.api.RemoteSmsService;
import com.newland.resource.api.domain.SysSms;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 短信服务
 *
 * @author newland
 */
@Slf4j
@RequiredArgsConstructor
@Service
@DubboService
public class RemoteSmsServiceImpl implements RemoteSmsService {

    private final SmsProperties smsProperties;

    /**
     * 发送短信
     *
     * @param phones     电话号(多个逗号分割)
     * @param templateId 模板id
     * @param param      模板对应参数
     */
    public SysSms send(String phones, String templateId, Map<String, String> param) throws ServiceException {
        if (!smsProperties.getEnabled()) {
            throw new ServiceException("当前系统没有开启短信功能！");
        }
        SmsTemplate smsTemplate = SpringUtils.getBean(SmsTemplate.class);
        SmsResult smsResult = smsTemplate.send(phones, templateId, param);
        return BeanUtil.toBean(smsResult, SysSms.class);
    }

}
