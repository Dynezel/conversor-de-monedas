package Entidades;

public class Moneda {
    private String monedaBase;
    private String monedaObjetivo;
    private String tasaDeConversion;
    private String resultado;



    public Moneda(String monedaBase, String monedaObjetivo, String tasaDeConversion, String resultado) {
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaObjetivo;
        this.tasaDeConversion = tasaDeConversion;
        this.resultado = resultado;
    }

    public Moneda(MonedaDTO monedaDTO) {
        this.monedaBase = monedaDTO.base_code();
        this.monedaObjetivo = monedaDTO.target_code();
        this.tasaDeConversion = monedaDTO.conversion_rate();
        this.resultado = monedaDTO.conversion_result();
    }


    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaObjetivo() {
        return monedaObjetivo;
    }

    public void setMonedaObjetivo(String monedaObjetivo) {
        this.monedaObjetivo = monedaObjetivo;
    }

    public String getTasaDeConversion() {
        return tasaDeConversion;
    }

    public void setTasaDeConversion(String tasaDeConversion) {
        this.tasaDeConversion = tasaDeConversion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
