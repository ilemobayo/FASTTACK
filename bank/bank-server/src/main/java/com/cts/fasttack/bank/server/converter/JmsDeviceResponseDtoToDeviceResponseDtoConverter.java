package com.cts.fasttack.bank.server.converter;

import org.springframework.stereotype.Component;
import com.cts.fasttack.bank.server.dto.DeviceResponseDto;
import com.cts.fasttack.common.core.converter.AbstractConverter;
import com.cts.fasttack.jms.dto.JmsDeviceResponseDto;

/**
 * {@link JmsDeviceResponseDto} to {@link DeviceResponseDto} converter.
 *
 * @author v.semerkov
 */
@Component
public class JmsDeviceResponseDtoToDeviceResponseDtoConverter extends AbstractConverter<JmsDeviceResponseDto, DeviceResponseDto> {

    @Override
    protected DeviceResponseDto generateTarget() {
        return new DeviceResponseDto();
    }

    @Override
    protected void lightConvert(JmsDeviceResponseDto source, DeviceResponseDto target) {
        target.setDeviceId(source.getDeviceId());
        target.setDeviceName(source.getDeviceName());
        target.setDeviceType(source.getDeviceType());
        target.setSecureElementId(source.getSecureElementId());
    }
}
