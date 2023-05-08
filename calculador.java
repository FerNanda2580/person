class calculador 
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

