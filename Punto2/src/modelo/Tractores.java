package modelo;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Tractores extends Vehiculos {

    private double precioDia;
    private GregorianCalendar fechaInicio;
    private GregorianCalendar fechaFin;

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public GregorianCalendar getfechaInicio() {
        return fechaInicio;
    }

    public void setfechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;

    }

    public GregorianCalendar getFechaFin() {
        return fechaFin;
    }


    public void setFechaFin(GregorianCalendar fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public double CalculaRenta() {
        Date di = fechaInicio.getTime();
        Date df = fechaFin.getTime();
        return precioDia * getDaysDiff(di, df);
    }

    public static int getDaysDiff(Date date1, Date date2) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);

        int d1 = cal.get(Calendar.DATE);

        cal.setTime(date2);

        int d2 = cal.get(Calendar.DATE);

        return d2 - d1;
    }

}
