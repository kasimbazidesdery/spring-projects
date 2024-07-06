package net.classroom.classroom.service.serviceImplementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
// import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;
// import lombok.NoArgsConstructor;
import net.classroom.classroom.dto.HostelDto;
import net.classroom.classroom.entity.StudentRoom;
import net.classroom.classroom.mapper.HostelMapper;
import net.classroom.classroom.repository.HostelRepository;
import net.classroom.classroom.service.HostelService;
import net.classroom.classroom.exception.ResourceNotFoundException;

@Service
@AllArgsConstructor
// @NoArgsConstructor
public class HostelImplementation  implements HostelService{

    private final HostelRepository hostelRepository;

    // private final StudentRepository studentRepository;

    @Override
    public HostelDto createHostelDto(HostelDto hostelDto) {

      StudentRoom studentRoom = HostelMapper.mapToStudentRoom(hostelDto);
      StudentRoom savedhostel = hostelRepository.save(studentRoom);
        return HostelMapper.mapToHostelDto(savedhostel);
    }

    @Override
    
    public List<HostelDto> getAllHostel() {
        List<StudentRoom> studentRoom = hostelRepository.findAll();
        return studentRoom.stream().map(HostelMapper::mapToHostelDto).collect(Collectors.toList());
    }

    @Override
    public HostelDto getById(Long userId) {
        StudentRoom hostRoom = hostelRepository.findById(userId).orElseThrow(()->
         new ResourceNotFoundException("Hostel with id " + userId + "  NOT FOUND"));
         return HostelMapper.mapToHostelDto(hostRoom);
             
    }



    @Override
public HostelDto updateHostelinformation(Long userId, HostelDto hostelDto) {
    StudentRoom studRoom = hostelRepository.findById(userId)
            .orElseThrow(() -> new ResourceNotFoundException("Hostel with id " + userId + " Not Found"));

    // Print out room name before setting
    System.out.println("Before setting: " + studRoom.getRoomName());

    studRoom.setRoomName(hostelDto.getRoomName());

    // Print out room name after setting
    System.out.println("After setting: " + studRoom.getRoomName());

    studRoom.setFloorName(hostelDto.getFloorName());
    studRoom.setHostelName(hostelDto.getHostelName());

    StudentRoom updatedInformation = hostelRepository.save(studRoom);

    return HostelMapper.mapToHostelDto(updatedInformation);
}

    @Override
    public void deleteHostel(Long userId) {
       
        StudentRoom stdrooms = hostelRepository.findById(userId).orElseThrow(()->
        new ResourceNotFoundException("hostel with id " + userId + " Not found"));

        hostelRepository.delete(stdrooms);
        
    }

    
    
}
