package net.classroom.classroom.service;


import java.util.List;

import net.classroom.classroom.dto.HostelDto;

public interface HostelService {
    HostelDto createHostelDto(HostelDto hostelDto);

    List<HostelDto> getAllHostel();

    HostelDto getById(Long userId);

    HostelDto updateHostelinformation(Long userId, HostelDto hostelDto);

     public void deleteHostel(Long userId);
}
