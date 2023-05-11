import java.net.ConnectException;

public class Puerto {
    private Barco[] puerto;
    private int indice=0;
    public Puerto (){
        this.puerto = new Barco[3];
    }
    public void añadirbarco()
    {
            this.puerto[indice] = new Barco();
            indice++;
    }
    public String toStringHub1()
    {
        return "Barco 1:\n"+puerto[0].toString();
    }
    public String toStringHub2()
    {
        return "Barco 2:\n"+puerto[1].toString();
    }
    public String toStringHub3()
    {
        return "Barco 3:\n"+puerto[2].toString();
    }
    public void apila(Contenedor contenedor, int indice)
    {
        puerto[indice].apila(contenedor);
    }
    public String desapila(int columna, int indice)
    {
        return puerto[indice].desapila(columna);
    }
    public String MostrarDatos(int identificador,int indice)
    {
        return puerto[indice].MostrarDatos(identificador);
    }
    public int contenedoresPais (String pais)
    {
        return puerto[0].contenedoresPais(pais)+puerto[1].contenedoresPais(pais)+puerto[2].contenedoresPais(pais);
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }


    //EXÁMEN DEL TRABAJO
    //La funcion muestraBasePrioridad pero que funcione para todos los hubs del puerto (es decir, en los 3 hubs)
    public String muestraBasePrioridad (int prioridad){
        String resultado = "";
        for (int i = 0; i < 3; i++) {
            resultado = resultado + puerto[i].muestraBasePrioridad(prioridad);
        }
        if (resultado==""){
            resultado="No hay contenedores con prioridad "+prioridad;
        }
        return resultado;
    }
}
