package pacclasses;

public class Industrial extends Conta{
    
    @Override
    public double calcularMulta(double consumo){
        if(consumo > 1000){
            return (consumo - 1000) * 0.40;
        }
        return 0;
    }
    
    @Override
    public double calcularConta(double consumo) {
        return consumo * 0.03 + iluminacaoPublica + calcularMulta(consumo);
    }
}
