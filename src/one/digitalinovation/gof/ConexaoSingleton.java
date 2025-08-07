package one.digitalinovation.gof;

public class ConexaoSingleton {
    
    private static ConexaoSingleton instance;

    private ConexaoSingleton(){

    }
    public static  ConexaoSingleton getInstance(){
        if(instance==null){
            synchronized(ConexaoSingleton.class){
                if(instance==null){
                     instance = new ConexaoSingleton();
               }
            }
         
        }
        return instance;
    }

}
