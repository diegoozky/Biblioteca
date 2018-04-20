
/**
 * Lista de libro de una biblioteca
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaLibros
{
   
    Libro primero;

    /**
     * Constructor for objects of class ListaNodos
     */
    public ListaLibros()
    {
       
        primero = null;
    }

   
    // Completar los metodos
    
    // Incluye un nuevo libro en la lista
    public void pon( Libro valor){
       Libro paux= primero;
        if(primero == null){
            primero=valor;
        }
        
        else{ 
            while (paux.siguiente != null){
                paux=paux.siguiente;
            }
            paux.siguiente=valor;
        }
    }
    
    public boolean estaVacia(){
       return ( primero == null );    
        
    }
    
    // Devuelve un libro que es eliminado de la lista o null si no exite
    public Libro quitar ( int id ) {
        Libro paux=primero;
        Libro resu=null;
        while(paux.siguiente != null){
            paux=paux.siguiente;
            if( paux.id== id){
                resu=paux;
                paux=null;
            }
            
        }
        return resu;
    }
   
    // Devuelve el id del libro o -1 si no esta
    public int buscarId ( String titulo ){
       Libro paux=primero;
       int resu = -1;
       while(paux.siguiente != null){
           paux.siguiente=paux;
           if(paux.titulo==titulo){
               resu=paux.id;
            }
        }
    return resu;
   }
    // Muestra los libros almacenados
    public void verCatalogo (){
        Libro paux=primero;
        while(paux!=null){
            System.out.println(paux.toString());
           paux=paux.siguiente;
            
        }
        
    }
         
    

}
