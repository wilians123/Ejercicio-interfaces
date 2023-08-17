public class Llamar implements Acuaticos, Terrestres, Aereos {

    @Override
    public String barco() {
        return "tipo de vehiculo acuatico para transportar";
    }

    @Override
    public String lancha() {
        return "tipo de vehiculo acuatico de uso turistico";
    }

    @Override
    public String velero() {
        return "tipo de vehiculo acuatico de uso turistico";
    }

    @Override
    public String avion() {
        return "tipo de vehiculo aereo para viajar";
    }

    @Override
    public String helicoptero() {
        return "tipo de vehiculo aereo de uso militar";
    }

    @Override
    public String avioneta() {
        return "tipo de vehiculo aereo de uso rural";
    }

    @Override
    public String motocicleta() {
        return "tipo de vehiculo terrestre de uso personal";
    }

    @Override
    public String automovil() {
        return "tipo de vehiculo terrestre de uso familiar";
    }

    @Override
    public String camion() {
        return "tipo de vehiculo terrestre para transportar";
    }
}
