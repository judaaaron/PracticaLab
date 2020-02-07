
package practicalab3;


public class Porteros {
    
    private int nivel;
    private int aereo;
    private int pies;

    public Porteros() {
    }

    public Porteros(int nivel, int aereo, int pies) {
        this.nivel = nivel;
        this.aereo = aereo;
        this.pies = pies;
    }

    public int getNivel() {
        return nivel;
    }

    public int getAereo() {
        return aereo;
    }

    public int getPies() {
        return pies;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setAereo(int aereo) {
        this.aereo = aereo;
    }

    public void setPies(int pies) {
        this.pies = pies;
    }

    @Override
    public String toString() {
        return "Porteros{" + "nivel=" + nivel + ", aereo=" + aereo + ", pies=" + pies + '}';
    }
    
    
    
    
}
