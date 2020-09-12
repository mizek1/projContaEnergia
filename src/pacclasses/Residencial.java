
package pacclasses;

public class Residencial extends Conta{
    
    
    @Override
    public double calcularMulta(double consumo){
        if(consumo > 200){
            return (consumo - 200) * 0.12;
        }
        return 0;
    }
    
    @Override
    public double calcularConta(double consumo) {        
        return consumo * 0.1 + iluminacaoPublica + calcularMulta(consumo);
    }
    
}
