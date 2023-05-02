public class App {
    public static void main(String[] args){
        Triangulo triangulo1 = new Triangulo(5,12,13,"vermelho");        
        System.out.println(triangulo1.Validez());
        triangulo1.setCor("azul");
        System.out.println (triangulo1.getCor());
        System.out.println (triangulo1);

    

    }
    
}
