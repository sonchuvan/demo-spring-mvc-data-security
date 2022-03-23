package entity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "driver")
public class Driver {

    @Id
    @Column(name = "driver_id")
    int driverId;
    @Column(name = "driver_name")
    String fullName;
    @Column(name = "driver_address")
    String address;
    @Column(name = "driver_phone")
    String phone;
    @Transient
    public static final String A = "A";
    @Transient
    public static final String B = "B";
    @Transient
    public static final String C = "C";
    @Transient
    public static final String D = "D";
    @Transient
    public static final String E = "E";
    @Transient
    public static final String F = "F";
    @Column(name = "driver_level")
    String level;

}
