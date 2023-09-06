package Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Vehicle {
    VehicleType vehicleType;
    String registrationNumber;
    VehicleColor vehicleColor;

}
