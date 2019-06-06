
package azul;

public class Gato {
    int cr;
String name;
String raca;
int idade;
boolean male;


public Gato(String g) {
    this.name = g;
}

public void miar() {     
    if(idade>=2){
       System.out.println("nhau");
    }else{
        System.out.println("minhau");
}
}

}

