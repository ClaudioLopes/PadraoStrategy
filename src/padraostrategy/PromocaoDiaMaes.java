package padraostrategy;

/**
 *
 * @author claudio
 */
public class PromocaoDiaMaes implements Promocao {
   
    public int obterDesconto(){
        return 10;
    }
    
    public String obterPromocao(){
        return "Dia das Mães";
    }
}
