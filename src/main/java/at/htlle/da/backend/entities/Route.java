package at.htlle.da.backend.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Route {

    @Id
    private Long id;

    private String start;
    private String end;

    @ManyToOne
    @JoinColumn(name = "name")
    private Type movementType;
    private Double lengthKm;

    private LocalDateTime timestamp;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Type getMovementType() {
        return movementType;
    }

    public void setMovementType(Type movementType) {
        this.movementType = movementType;
    }

    public Double getLengthKm() {
        return lengthKm;
    }

    public void setLengthKm(Double lengthKm) {
        this.lengthKm = lengthKm;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
