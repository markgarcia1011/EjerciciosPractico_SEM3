
package notas;


public class Notas {

 double Nota1;
     double Nota2;
     double Nota3;
    
    public Notas(){
        
    }

    public Notas(double nota1, double nota2, double nota3) {
        this.Nota1 = nota1;
        this.Nota2 = nota2;
        this.Nota3 = nota3;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double nota1) {
        this.Nota1 = nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double nota2) {
        this.Nota2 = nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double nota3) {
        this.Nota3 = nota3;
    }
   
}
