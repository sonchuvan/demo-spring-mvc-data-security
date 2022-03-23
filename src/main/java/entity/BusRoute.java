package entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "bus_route")
public class BusRoute {

    public static int COUNT;
    @Id
    @Column(name = "bus_route_id")
    int busRouteId;
    @Column(name = "bus_route_range")
    float range;
    @Column(name = "bus_route_stop_number")
    int numberOfStops;
}
