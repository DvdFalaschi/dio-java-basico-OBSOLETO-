public class Metodo {

    public static void main(String[] args) throws Exception {

        String primeiroNome = "David";
        String segundoNome = "Falaschi";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.print(nomeCompleto);    
    }
       
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
            
}

