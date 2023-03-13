
package ArbolBinariodeBusqueda;

public class Main {

    public static void main(String[] args) {
        ArbolBB arbol= new ArbolBB();
        arbol.insertNodoBB(arbol.getRoot(), 20);
        arbol.insertNodoBB(arbol.getRoot(), 10);
        arbol.insertNodoBB(arbol.getRoot(), 30);
        arbol.insertNodoBB(arbol.getRoot(), 5);
        arbol.insertNodoBB(arbol.getRoot(), 25);
        arbol.insertNodoBB(arbol.getRoot(), 40);
        arbol.insertNodoBB(arbol.getRoot(), 33);
        arbol.Preorden(arbol.getRoot());
        System.out.println("Eliminar");
        arbol.deleteNodoBB(arbol.getRoot(), 5);
        arbol.Preorden(arbol.getRoot());
    }
    
}
