package at.htlle.da.backend.entities;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    private String email;
    @Column(unique = true)
    private String username;
    private String firstName;
    private String lastName;
    private String profilePictureHash;


    public UserEntity() {
    }

    @OneToMany(mappedBy = "receiver", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FriendRequest> receiver = new ArrayList<>();

    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FriendRequest> sender = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Friend> friends = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Route> routes = new ArrayList<>();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Friend> getFriends() {
        return friends;
    }


    public List<FriendRequest> getReceiver() {
        return receiver;
    }


    public List<FriendRequest> getSender() {
        return sender;
    }


    public String getProfilePictureHash() {
        return profilePictureHash;
    }

    public void setProfilePictureHash(String profilePicture) {
        this.profilePictureHash = profilePicture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    public void setReceiver(List<FriendRequest> receiver) {
        this.receiver = receiver;
    }

    public void setSender(List<FriendRequest> sender) {
        this.sender = sender;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void ListRoutes(List<Route> routes) {
        this.routes = routes;
    }
}
