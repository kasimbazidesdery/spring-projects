package net.classroom.classroom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_room")
public class StudentRoom {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomNumber;
    private String roomName;
    private String floorName;
    private String hostelName;
}
