

package com.mycompany.ciudadanos;

public class Ciudadanos {
     private int id;
    private String nombre;

    public Ciudadanos(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    private Ciudadanos() {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

  
    public String toString() {
        return "ID: " + id + " - " + nombre;
    }

   
    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Ciudadanos)) return false;
    Ciudadanos c = (Ciudadanos) obj;
    return this.id == c.id;
}
    
   
}

    

