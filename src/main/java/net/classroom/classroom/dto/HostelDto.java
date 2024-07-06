package net.classroom.classroom.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HostelDto {
    private Long roomNumber;
    private String roomName;
    private String floorName;
    private String hostelName;
}
