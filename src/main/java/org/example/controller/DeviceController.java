package org.example.controller;

import org.example.dto.DeviceDto;
import org.example.entity.Device;
import org.example.service.DeviceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device")
public class DeviceController {

    private final DeviceService service;

    public DeviceController(DeviceService service) {
        this.service = service;
    }

    @GetMapping("info")
    public String hello() {
        return "HEllo";
    }

    @PostMapping
    public String addDevice(@RequestBody DeviceDto device) {
        return service.addDevice(device) ? "Added" : "Not Added";
    }

    @GetMapping
    public List<Device> getAllDevicesOfPerson(@RequestParam Long personId) {
        return service.getPersonDevices(personId);
    }

}
