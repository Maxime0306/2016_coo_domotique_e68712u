import thermos.Thermostat;

public class AdapterThermostat implements Peripherique {
    private Thermostat thermostat;

    public AdapterThermostat(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void allumer() {
        this.thermostat.monterTemperature();
    }

    public void eteindre() {
        this.thermostat.baisserTemperature();
    }

    public String toString() {
        return "Thermostat: ";
    }
}
