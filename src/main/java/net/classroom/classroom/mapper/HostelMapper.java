package net.classroom.classroom.mapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
// import lombok.NoArgsConstructor;
import lombok.Setter;
import net.classroom.classroom.dto.HostelDto;
import net.classroom.classroom.entity.StudentRoom;

@Getter
@Setter
// @NoArgsConstructor
@AllArgsConstructor
public class HostelMapper {
    public static HostelDto mapToHostelDto(StudentRoom studentRoom)
    {
        //create the entity Object
         
        HostelDto hostelDto = new HostelDto();
        hostelDto.setRoomNumber(studentRoom.getRoomNumber());
        hostelDto.setRoomName(studentRoom.getRoomName());
        hostelDto.setFloorName(studentRoom.getFloorName());
        hostelDto.setHostelName(studentRoom.getHostelName());
        return hostelDto;
    }

    public static StudentRoom mapToStudentRoom(HostelDto hostelDto)
    {
        

        StudentRoom studentRoom = new StudentRoom();
        studentRoom.setRoomNumber(hostelDto.getRoomNumber());
        studentRoom.setRoomName(hostelDto.getRoomName());
        studentRoom.setFloorName(hostelDto.getFloorName());
        studentRoom.setHostelName(hostelDto.getHostelName());
        return studentRoom;
    }
}
