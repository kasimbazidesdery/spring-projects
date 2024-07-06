package net.classroom.classroom.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.classroom.classroom.dto.HostelDto;
// import net.classroom.classroom.entity.StudentRoom;
// import net.classroom.classroom.mapper.HostelMapper;
// import net.classroom.classroom.entity.StudentRoom;
import net.classroom.classroom.service.HostelService;

@Getter
@Setter
@RestController
@Controller
@RequestMapping("/api")
@AllArgsConstructor
public class HostelController {
     private final HostelService hostelService;

     @PostMapping("/hostel")
     public ResponseEntity<HostelDto> createHostel(@RequestBody HostelDto hostelDto)
     { 
         HostelDto savedHostelDto = hostelService.createHostelDto(hostelDto);
         
         return new ResponseEntity<>(savedHostelDto,HttpStatus.CREATED);
     }

     @GetMapping("/hostels")

     public ResponseEntity<List<HostelDto>> getAllHostel(){
        List<HostelDto> hostels = hostelService.getAllHostel();
        return  new ResponseEntity<>(hostels, HttpStatus.OK);
          
       
     }

     @GetMapping("/hostel/{id}")
     public ResponseEntity<HostelDto> getById(@PathVariable("id") Long userId)
     { 
         HostelDto hostelDto = hostelService.getById(userId);

        return new ResponseEntity<>(hostelDto, HttpStatus.OK);
     }


     @PutMapping("/update/{id}")
     public ResponseEntity<HostelDto> updateHostelInfor(@PathVariable("id") Long userId, @RequestBody HostelDto hostelDto)
     { 
         
        HostelDto hostdto = hostelService.updateHostelinformation(userId, hostelDto);
        return new ResponseEntity<>( hostdto, HttpStatus.OK);
     }

     //Deleting hostel identity based on the user id


     @DeleteMapping("/delete/{id}")
     public ResponseEntity<String> deleteHostel(@PathVariable("id") Long userId)
     {
                        hostelService.deleteHostel(userId);
        return new ResponseEntity<>("The hostel deleted successfully" , HttpStatus.OK);
     }
}
