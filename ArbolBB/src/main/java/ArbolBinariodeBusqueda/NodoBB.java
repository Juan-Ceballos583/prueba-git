
package ArbolBinariodeBusqueda;


public class NodoBB {
    private int element;
    private NodoBB hijoIzq;
    private NodoBB hijoDer;
    private NodoBB Padre;

    public NodoBB(int element) {
        this.element = element;
        this.hijoIzq = null;
        this.hijoDer = null;
        this.Padre = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public NodoBB getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoBB hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoBB getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoBB hijoDer) {
        this.hijoDer = hijoDer;
    }

    public NodoBB getPadre() {
        return Padre;
    }

    public void setPadre(NodoBB Padre) {
        this.Padre = Padre;
    }
    
    
    
}
