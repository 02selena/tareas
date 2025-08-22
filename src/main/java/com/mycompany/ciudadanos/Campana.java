
package com.mycompany.ciudadanos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Campana {

    private Set<Ciudadanos> conjuntoCiudadanos;
    private Set<Ciudadanos> pfizer;
    private Set<Ciudadanos> astrazeneca;

    public Campana() {
        conjuntoCiudadanos = new HashSet<>();
        pfizer = new HashSet<>();
        astrazeneca = new HashSet<>();
        generarCiudadanos();
        generarVacunados();
    }

    private void generarCiudadanos() {
        for (int i = 1; i <= 500; i++) {
            conjuntoCiudadanos.add(new Ciudadanos(i, "Ciudadado " + i));
        }
    }

    private void generarVacunados() {
        List<Ciudadanos> lista = new ArrayList<>(conjuntoCiudadanos);
        Collections.shuffle(lista);

        for (int i = 0; i < 75; i++) {
            pfizer.add(lista.get(i));
        }
        for (int i = 75; i < 150; i++) {
            astrazeneca.add(lista.get(i));
        }
    }

    public Set<Ciudadanos> noVacunados() {
        Set<Ciudadanos> vacunados = new HashSet<>(pfizer);
        vacunados.addAll(astrazeneca);
        Set<Ciudadanos> noVacunados = new HashSet<>(conjuntoCiudadanos);
        noVacunados.removeAll(vacunados);
        return noVacunados;
    }

    public Set<Ciudadanos> ambasVacunas() {
        Set<Ciudadanos> ambas = new HashSet<>(pfizer);
        ambas.retainAll(astrazeneca);
        return ambas;
    }

    public Set<Ciudadanos> soloPfizer() {
        Set<Ciudadanos> soloP = new HashSet<>(pfizer);
        soloP.removeAll(astrazeneca);
        return soloP;
    }

    public Set<Ciudadanos> soloAstraZeneca() {
        Set<Ciudadanos> soloA = new HashSet<>(astrazeneca);
        soloA.removeAll(pfizer);
        return soloA;
    }

    public void mostrarListados() {
        System.out.println("===== CAMPAÑA DE VACUNACIÓN COVID-19 =====");

        System.out.println("\n1. Ciudadanos NO vacunados: " + noVacunados().size());
        noVacunados().forEach(System.out::println);

        System.out.println("\n2. Ciudadanos con AMBAS dosis: " + ambasVacunas().size());
        ambasVacunas().forEach(System.out::println);

        System.out.println("\n3. Ciudadanos SOLO Pfizer: " + soloPfizer().size());
        soloPfizer().forEach(System.out::println);

        System.out.println("\n4. Ciudadanos SOLO AstraZeneca: " + soloAstraZeneca().size());
        soloAstraZeneca().forEach(System.out::println);
    }

    void mostrarlistado() {
        throw new UnsupportedOperationException("Not supported yet."); 

    }
}

    

