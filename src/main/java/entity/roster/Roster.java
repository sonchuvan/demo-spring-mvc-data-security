package entity.roster;

import entity.BusRoute;
import entity.Driver;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "roster")
public class Roster {

    @Id
    @ManyToOne(targetEntity = Driver.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "driver_id", nullable = false)
    Driver driver;
    @Id
    @ManyToOne(targetEntity = BusRoute.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "bus_route_id", nullable = false)
    BusRoute busRoute;
    @Column(name = "route_quantity")
    int routeQuantity;
}
