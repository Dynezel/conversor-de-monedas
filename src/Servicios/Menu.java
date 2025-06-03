package Servicios;

import Entidades.Moneda;
import Entidades.MonedaDTO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    Gson gson = new Gson();
    public void convertirMoneda(String monedaBase, String monedaObjetivo, double cantidad) throws IOException, InterruptedException {
        //Se llama al metodo para cargar la lista de nombres para el retorno
        List<String> nombresMonedas = cargarListaJson(monedaBase, monedaObjetivo);
        //Llamado al metodo que trae los datos de la API
        MonedaDTO monedaDTO = retornarJson(monedaBase, monedaObjetivo, cantidad);
        //Se crea un Objeto Moneda para alojar los datos
        Moneda moneda = new Moneda(monedaDTO);

        System.out.println("La cantidad de: [" + cantidad + "] " + nombresMonedas.get(0) + " es igual a: [" + moneda.getResultado() + "] " + nombresMonedas.get(1));
    }

    public MonedaDTO retornarJson(String monedaBase, String monedaObjetivo, double cantidad) throws IOException, InterruptedException {
        String direccion = "https://v6.exchangerate-api.com/v6/8e5e8ee0ab10cf848781e615/pair/" + monedaBase + "/" + monedaObjetivo + "/" + cantidad;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        //Traemos el JSON de la respuesta
        String json = response.body();
        return gson.fromJson(json, MonedaDTO.class);
    }

    public List<String> cargarListaJson(String monedaBase, String monedaObjetivo) throws FileNotFoundException {
        //Lectura del archivo JSON que contiene la lista de monedas
        BufferedReader br = new BufferedReader(new FileReader("monedas.json"));
        //Se asigna un objeto Json con los resultados
        JsonObject js = gson.fromJson(br, JsonObject.class);
        //Se crea una lista para alojar los nombres relevantes
        List<String>listaNombres = new ArrayList<>();
        //Se asignan los valores a la lista
        listaNombres.add(js.get(monedaBase).getAsString());
        listaNombres.add(js.get(monedaObjetivo).getAsString());
        //Se retorna la lista
        return listaNombres;
    }
}