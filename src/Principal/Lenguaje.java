
package Principal;

public class Lenguaje {
    private final int size;
    String arr[];


    public Lenguaje(String[] arr) {
        this.size = arr.length;
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }
    public String getAt(int index){
        return arr[index];
    }
    
}
