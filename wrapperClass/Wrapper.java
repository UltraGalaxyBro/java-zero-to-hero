package wrapperClass;

public class Wrapper {
    public static void main(String[] args) {
        //Em tipos primitivos não é permitido valores nulos. Já em wrapper classes sim
        int intType = 1;
        float floatType = 1f;
        double doubleType = 10.26;
        boolean booleanType = true;
        //int e char tem diferenças para serem usadas uma wrapper em seus tipos, mas o restante é igual a forma de sintaxe
        //No caso do int é o Integer e do char é o Character. O restante é só usar com a primeira letra maiúscula o nome base do tipo
        Integer intType2 = null;
        Float floatType2 = 3f;
        Double doubleType2 = 100.57;
        Boolean booleanType2 = false;

    }
}
