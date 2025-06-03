package Entidades;

public class Moneda {
    private final String monedaBase;
    private final String monedaObjetivo;
    private final String tasaDeConversion;
    private final String resultado;

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

    public String getMonedaObjetivo() {
        return monedaObjetivo;
    }

    public String getTasaDeConversion() {
        return tasaDeConversion;
    }

    public String getResultado() {
        return resultado;
    }
}
