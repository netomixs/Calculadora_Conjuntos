/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.List;

public class Operaciones {

    List<String> Universo;
    List<Lenguaje> Lenguajes;

    public Operaciones() {
        this.Universo = new ArrayList();
        this.Lenguajes = new ArrayList();
    }

    public Operaciones(String universo, String lenguajes) {
        this.Universo = new ArrayList();
        this.Lenguajes = new ArrayList();
        crearUniverso(universo);
        crearListaLenguaje(lenguajes);

    }

    private void toUniverso(String[] arr) {
        this.Universo.addAll(Arrays.asList(arr));
    }

    private void agregarAlUniverso(String str) {
        this.Universo.add(str);
    }

    private void agregarLenguaje(Lenguaje l) {
        this.Lenguajes.add(l);
    }

    Lenguaje crearLenguaje(String[] arr) {
        Lenguaje l = new Lenguaje(arr);
        return l;
    }

    private void toListaLenguajes(String[] arr) {
        for (String i : arr) {
            String[] lenguaje = i.split(",");
            agregarLenguaje(crearLenguaje(lenguaje));
        }
    }

    public void limpiarUniverso() {
        this.Universo = new ArrayList();
        this.Lenguajes = new ArrayList();
    }

    private void crearListaLenguaje(String str) {
        str = str.replaceAll("\\{", "");
        String[] arr = str.split("\\}");
        toListaLenguajes(arr);
    }

    private void crearUniverso(String str) {
        String[] u = str.split(",");

        toUniverso(u);
        //System.out.println(Arrays.toString(u));
    }

    public void unificar() {

        for (int i = 0; i < this.Lenguajes.size(); i++) {
            Lenguaje l = this.Lenguajes.get(i);
            for (int j = 0; j < l.getSize(); j++) {
                if (!this.Universo.contains(l.getAt(j))) {
                    agregarAlUniverso(l.getAt(j));
                }
            }
        }
    }
    //Comprueba que los lenhuajes no contengan elementos no peretnecientes al universo
    public int[] verificar() {
        for (int i = 0; i < this.Lenguajes.size(); i++) {
            Lenguaje l = this.Lenguajes.get(i);
            System.out.println(this.Lenguajes.size());
            for (int j = 0; j < l.getSize(); j++) {
                if (this.Universo.contains(l.getAt(j))) {
                    System.out.println(l.getAt(j));
                } else {
                    System.out.println(l.getAt(j));
                    for (int k = 0; k < l.getAt(j).length(); k++) {
                        if (!this.Universo.contains(l.getAt(j).charAt(k) + "")) {
                            return new int[]{i, j};
                        }
                    }
                }

            }
        }
        return new int[]{-1, -1};
    }

    public void mostrarUniverso() {
        System.out.println("U=" + this.Universo.toString());
    }

    public void mostrarLenguajes() {
        int num = 1;
        for (Lenguaje lenguaje : this.Lenguajes) {
            System.out.print("L" + num + "= ");
            num++;
            for (int i = 0; i < lenguaje.getSize(); i++) {
                System.out.print(lenguaje.getAt(i) + ",");
            }
            System.out.println("");
        }
    }

    public void mostrarTodo() {

        mostrarUniverso();
        mostrarLenguajes();
    }

    public String[] union(List<String> a, List<String> b) {
        a = new ArrayList<String>(a);
        b = new ArrayList<String>(b);
        for (String element : b) {
            if (!a.contains(element)) {
                a.add(element);
            } else {
            }
        }

        return a.toArray(new String[a.size()]);
    }
    public int duplicadosUniverso(){
        String aux ="";
        for(int i=0;i<this.Universo.size();i++){
            String str=this.Universo.get(i);
            for(int j=0;j<str.length();j++){
                  if(aux.contains(str.charAt(j)+"")){
                    
                return i;
            }else{  
                  }
            } 
                aux=aux+str;
            }  
         
        
        return -1;
    }
    boolean compararString(String a, String b){
        for(int i=0;i<b.length();i++){
            if(a.contains(b.charAt(i)+"")){
                return true;
            }
            
        }
        return false;
    }
public int[] duplicadosLenguaje(){
        for(int i=0;i<this.Lenguajes.size();i++){
            ArrayList<String> aux=new ArrayList();
            Lenguaje lenguaje=this.Lenguajes.get(i);
            for(int j=0;j<lenguaje.getSize();j++){
                if(aux.contains(lenguaje.getAt(j)+"")){
                    return new int[]{i,j};
                }else{
                    aux.add(lenguaje.getAt(j)+"");
                }
            }
        }
        return new int[]{-1,-1};
    }
    public String[] interseccion(List<String> a, List<String> b) {
        a = new ArrayList<String>(a);
        b = new ArrayList<String>(b);
        List<String> res = new ArrayList();
        for (String element : b) {
            if (a.contains(element)) {
                res.add(element);
            } else {
            }
        }
        return res.toArray(new String[res.size()]);
    }

    public String[] diferencia(List<String> a, List<String> b) {
        a = new ArrayList<String>(a);
        b = new ArrayList<String>(b);
        for (String element : b) {
            if (a.contains(element)) {
                a.remove(element);
            } else {
            }
        }
        return a.toArray(new String[a.size()]);
    }

    public String[] diferenciaSimetrica(List<String> a, List<String> b) {
        a = new ArrayList<String>(a);
        b = new ArrayList<String>(b);
        List<String> res = new ArrayList();
        res.addAll(asList(diferencia(a, b)));
        res.addAll(asList(diferencia(b, a)));
        return res.toArray(new String[res.size()]);
    }
        public String[] complemento(List<String> a) {
        a = new ArrayList<String>(a);
        
        List<String> res = new ArrayList();
        res.addAll(this.Universo);
        res.removeAll(a);
        return res.toArray(new String[res.size()]);
    }
 public String[] multiplicacion(List<String> a, List<String> b) {
        a = new ArrayList<String>(a);
        b = new ArrayList<String>(b);
        List<String> res = new ArrayList();
     for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                res.add(a.get(i)+""+b.get(j));
         }
         }
        return res.toArray(new String[res.size()]);
    }
  public String[] kleen(List<String> a,int x) {
      int size;
        a = new ArrayList<String>(a);
         List<String> aux = new ArrayList<String>();
        List<String> res = new ArrayList();
        
    while(x!=2){
        size=a.size();
           for (int i = 0; i < size; i++) {
            for (int j = 0; j <size; j++) {
                a.add(a.get(i)+""+a.get(j));

            }
         }
           x++;
    }
  
     

      a.add(0,"ϵ");
         a.add(a.size(),"∞");
 
     return a.toArray(new String[a.size()]); 

     
        
    }
  public String[] positivo(List<String> a,int x) {
      int size;
        a = new ArrayList<String>(a);
         List<String> aux = new ArrayList<String>();
        List<String> res = new ArrayList();
        size=a.size();

     for (int i = 0; i < size; i++) {
            for (int j = 0; j <size; j++) {
                res.add(a.get(i)+""+a.get(j));
            }
         }
     while(x!=1){
          size=res.size();

     for (int i = 0; i < size; i++) {
            for (int j = 0; j <size; j++) {
                res.add(res.get(i)+""+res.get(j));
            }
         }
     x++;
     }

  
        
         res.add(res.size(),"∞");
     return res.toArray(new String[res.size()]);   
     
     
        
    }
    
}
