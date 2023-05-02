public class Triangulo extends Poligono{
    String cor;


    public Triangulo(int lado1, int lado2,int lado3,String cor){
        super(new int[3],"triangulo");
        _lados[0] = lado1;
        _lados[1] = lado2;
        _lados[2] = lado3;
        this.cor =cor;
    }
    //isoceles:
    public Triangulo(int base, int lados,String cor){
        super(new int [3],"trianguloEquilatero");
        _lados[0] = base;
        _lados[1] = lados;
        _lados[2] = lados; 
        this.cor =cor;
    }
    //equilatero:
    public Triangulo(int lado, String cor){
        super(new int [3],"trianguloEquilatero");
        _lados[0] = lado;
        _lados[1] = lado;
        _lados[2] = lado; 
        this.cor =cor;
    }

    public boolean Validez(){
        int valorIntermediario;
        for(int i = 0; i<3;i +=1)
            if(_lados[i]> _lados[0]){
                valorIntermediario = _lados[0];
                _lados[0] = _lados[i];
                _lados[i] = valorIntermediario;
            }    
        return(_lados[0] > Math.abs(_lados[1] - _lados[2]) && _lados[0] < (_lados[1] + _lados[2]));   
    
    }

    public int[] getLados(){return _lados;}
    public String getCor(){return cor;}
    public void setLados(int lados[]){
        _lados[0] = lados[0];
        _lados[1] = lados[1];
        _lados[2] = lados[2];
    }
    public void setCor(String cor){
        this.cor = cor;
    }

}