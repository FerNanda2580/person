class Personagem {
    private String nome;
    private int energia;

    
    public Personagem(String n, int e) {
        
        this.nome = n;
        this.energia = e;
    }

    
    public String getN() {
        return this.nome;
    }
}


class Calculador 
{
    public double potencia(double n, int p)
    {
        double n = p;
        int contador = 0;

        while(contador < p)
        {
            n = n * n;
            contador++;
        }

        return n;
    }
}
