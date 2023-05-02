public class Retangulo extends Poligono {
        public Retangulo(int lado) { // cria quadrado
            super(4, lado, "quadrado");
            //_tipo = "quadrado"; // gera erro se _tipo for private 
        }    
    
        public Retangulo(int largura, int altura) {
            super(new int[4], "Retangulo");
            // gera erro se _lados for private
            _lados[0] = _lados[2] = largura;
            _lados[1] = _lados[3] = altura;
            //_tipo = "Retangulo"; // gera erro se _tipo for private 
        }
    
        public double calculaÁrea() {
            return pegaLargura()*pegaAltura();
        }
    
        public int pegaLargura() { return _lados[0]; }
        public int pegaAltura() { return _lados[1]; }
       
    }

