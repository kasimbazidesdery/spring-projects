package net.classroom.classroom.service;


import java.util.List;

import net.classroom.classroom.dto.HostelDto;

public interface HostelService {

    //creating the user / 
    HostelDto createHostelDto(HostelDto hostelDto); //instation of the method
     
     //getting user informations
    List<HostelDto> getAllHostel();
   
    //getting user based on the primary key(id)
    HostelDto getById(Long userId);

    //updating the user information
    HostelDto updateHostelinformation(Long userId, HostelDto hostelDto);


    // Deleting the user service
     public void deleteHostel(Long userId);

     

}
