package com.lwdevelop.backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mid;
    @NonNull
    private String email;
    @NonNull private String password;
    @NonNull
    private String Name;
    @NonNull
    private String Biography;
}

// @Entity
// public class Member {

//     @Id
//     private String mid;
//     private String email;
//     private String password;
//     private String Name;
//     private String Biography;

//     public Member() {
//     }

//     public Member(String email, String password, String Name, String Biography) {
//         this.mid = UUID.randomUUID().toString().replaceAll("-", "");
//         this.email = email;
//         this.password = password;
//         this.Name = Name;
//         this.Biography = Biography;
//     }

//     public String getMid() {
//         return mid;
//     }

//     public void setMid(String mid) {
//         this.mid = mid;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }

//     public String getPassword() {
//         return password;
//     }

//     public void setPassword(String password) {
//         this.password = password;
//     }

//     public String getName() {
//         return Name;
//     }

//     public void setName(String Name) {
//         this.Name = Name;
//     }

//     public String getBiography() {
//         return Biography;
//     }

//     public void setBiography(String Biography) {
//         this.Biography = Biography;
//     }

// }
