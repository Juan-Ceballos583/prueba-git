
package ArbolBinariodeBusqueda;

public class ArbolBB {
    private NodoBB root;

    public ArbolBB() {
        this.root= null;
    }

    public NodoBB getRoot() {
        return root;
    }

    public void setRoot(NodoBB root) {
        this.root = root;
    }
    
    public boolean isEmpty(){
        return getRoot() == null;
    }
    
    public void insertNodoBB(NodoBB raiz, int element){
        NodoBB nodo= new NodoBB(element);
        if (isEmpty()){
            setRoot(nodo);
        }else{
            if (element <= raiz.getElement()){
                if (raiz.getHijoIzq() == null){
                    raiz.setHijoIzq(nodo);
                    nodo.setPadre(raiz);
                }else{
                    insertNodoBB(raiz.getHijoIzq(), element);
                }
            }else{
                if (raiz.getHijoDer() == null){
                    raiz.setHijoDer(nodo);
                    nodo.setPadre(raiz);
                }else{
                    insertNodoBB(raiz.getHijoDer(), element);
                }
            }
        }
    }
    
    public void Preorden(NodoBB root){
        if (root != null){
            System.out.println("{"+ root.getElement()+ "}");
            Preorden(root.getHijoIzq());
            Preorden(root.getHijoDer());
        }
    }
    
    public void Inorden(NodoBB root){
        if (root != null){
            Inorden(root.getHijoIzq());
            System.out.println("{"+ root.getElement()+ "}");
            Inorden(root.getHijoDer());
        }
    }
    
    public void Postorden(NodoBB root){
        if (root != null){
            Postorden(root.getHijoIzq());
            Postorden(root.getHijoDer());
            System.out.println("{"+ root.getElement()+ "}");
        }
    }
    public void deleteNodoBB(NodoBB raiz, int element){
        if (!isEmpty()){
            if (raiz == null){
                System.out.println("No se consiguio el nodo");
            }else{
                if (element == raiz.getElement()){
                if (raiz.getHijoIzq() == null && raiz.getHijoDer() == null){
                    //Es una hoja
                    if (element < raiz.getPadre().getElement()){
                        raiz.getPadre().setHijoIzq(null);
                    }else{
                        raiz.getPadre().setHijoDer(null);
                    }
                    raiz.setPadre(null);
                }else if (raiz.getHijoIzq() == null){
                    //Tiene solo hijo derecho
                    if (element < raiz.getPadre().getElement()){
                        raiz.getPadre().setHijoIzq(raiz.getHijoDer());
                    }else{
                        raiz.getPadre().setHijoDer(raiz.getHijoDer());
                    }
                    raiz.getHijoDer().setPadre(raiz.getPadre());
                    raiz.setHijoDer(null);
                    raiz.setPadre(null);
                }else if (raiz.getHijoDer() == null){
                    //Tiene solo hijo izquierdo
                    if (element < raiz.getPadre().getElement()){
                        raiz.getPadre().setHijoIzq(raiz.getHijoIzq());
                    }else{
                        raiz.getPadre().setHijoDer(raiz.getHijoIzq());
                    }
                    raiz.getHijoIzq().setPadre(raiz.getPadre());
                    raiz.setHijoIzq(null);
                    raiz.setPadre(null);
                }else{
                    NodoBB nodo= searchNodotoReplace(raiz.getHijoIzq());
                    boolean haveRightChildren= checkNodotoReplace(raiz.getHijoIzq());
                    if (checkNodotoReplace(raiz.getHijoIzq())){
                        nodo.getPadre().setHijoIzq(null);
                    }
                    if (raiz.getPadre().getHijoIzq().getElement() == element){
                        
                        nodo.setPadre(raiz.getPadre());
                        nodo.setHijoIzq(raiz.getHijoIzq());
                        nodo.setHijoDer(raiz.getHijoDer());
                        raiz.getPadre().setHijoIzq(nodo);
                    }else{
                        nodo.setPadre(raiz.getPadre());
                        nodo.setHijoIzq(raiz.getHijoIzq());
                        nodo.setHijoDer(raiz.getHijoDer());
                        raiz.getPadre().setHijoDer(nodo); 
                    }
                    raiz.setHijoDer(null);
                    raiz.setHijoIzq(null);
                    raiz.setPadre(null);
                            
                }
            }else if (element < raiz.getElement()){
                deleteNodoBB(raiz.getHijoIzq(), element);
                
                
            }else{
                deleteNodoBB(raiz.getHijoDer(), element);
            }
            
        }
        
    }else{
            System.out.println("El arbol esta vacio, por lo cual, no se puede eliminar ningun nodo");
        }
    }
    
    public NodoBB searchNodotoReplace(NodoBB raiz){
        while (raiz.getHijoDer() != null){
            raiz= raiz.getHijoDer();
        }
        return raiz;
    }
    
    public boolean checkNodotoReplace(NodoBB raiz){
        return raiz.getHijoDer() != null;
          
    }
    
    
    }
