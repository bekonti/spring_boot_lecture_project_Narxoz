package org.example.service;

import org.example.dto.DeviceDto;
import org.example.entity.Device;
import org.example.entity.Person;
import org.example.repository.DeviceRepository;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DeviceService {

    private final DeviceRepository repository;

    private final UserRepository userRepository;


    public DeviceService(DeviceRepository repository, UserRepository userRepository) {
        this.repository = repository;
        this.userRepository = userRepository;
    }

    public boolean addDevice(DeviceDto deviceDto) {
        Device device = new Device();
        device.setName(deviceDto.getName());

        Person person = userRepository
                .findById(Long.valueOf(deviceDto.getPersonId())).get();

        device.setPerson(person);
        repository.save(device);

        return true;
    }

    public List<Device> getPersonDevices(Long personId) {
        Person person = userRepository
                .findById(personId)
                .orElse(null);
        if(person == null) return Collections.emptyList();
        return repository.findAllByPerson(person);
    }

}
