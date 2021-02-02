package com.slobodianiuk.springcourse;

import com.slobodianiuk.springcourse.Devices.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeviceDistributor {
    private final Device device;

    @Autowired
    public DeviceDistributor(Device device) {
        this.device = device;
    }

    public void runDevice() {
        device.play();
    }
}