
public class Matematico
{   /*Dados tres números: El matemático sabe indicar cual es el numero mayor,
         cual el menor y cual del medio*/
    public String Mayor(double N1,double N2,double N3){
        if (N1>N2 && N1>N3 && N2>N3){
            // a,b,c
            String mensaje; 
            mensaje = "N°1 Mayor, N°2 Medio, N°3 Menor";
            return (mensaje);
        }
           else if (N1>N2 && N1>N3 && N3>N2 ) {
            // a,c,b
                    // a>b && a>b && c>b
            String mensaje; 
            mensaje = "N°1 Mayor,N°2 Menor, N°3 Medio";
            return (mensaje);  
            }
            else if (N2>N1 && N2>N3 && N1>N3){
              // b,a,c
             String mensaje; 
             mensaje = "N°1 Medio , N°2 Mayor, N°3 Menor";
              return (mensaje);  
            }
            else if (N2>N1 && N2>N3 && N3>N1){
            //b,c,a
            String mensaje; 
              mensaje = " N°1 Menor, N°2 Mayor, N°3 Medio";
              return (mensaje); 
            }
            else if (N3>N1 && N3>N2 && N1>N2){
            //c,a,b
            String mensaje; 
              mensaje = "N°1 Medio, N°2 Menor, N°3 Mayor";
              return (mensaje); 
            }
            else  {
            // c,b,a
            String mensaje; 
              mensaje = "N°1 Menor, N°2 Medio, N°3 Mayor";
              return (mensaje);
            }
        }
     /* Dados la base y altura de un cuadrado: 
       El sabe indicar el área de dicha figura.*/   
    public String area ( double base, double altura){
        if (base == altura){
        double area = base* altura;
        String resultado;
        resultado = "El area del Cuadrado es: ";
        return (resultado + area);
       }
       else {
        String resultado;
        resultado = "No es un Cuadrado";
        return (resultado);
       }
    }
    /*Dados las coordenadas de dos puntos: 
     Sabe calcular distancia entre estos puntos.*/
    public double distancia ( double x1 , double y1 , double x2 , double y2)
    {
      double x = x2-x1;
      double y = y2-y1;
      double d= Math.sqrt (Math.pow(x,2)+ Math.pow (y,2)); 
       return d;
    }
    /*Dado las coordenadas de un punto: 
     Es capaz de indicar en que cuadrante se encuentra dicho punto.*/
    public String  cuadrante ( double x , double y){
      if (x>0 && y>0){
        String mensaje;
        mensaje = "1er Cuadrante";
       return (mensaje);
       }
       else if (x<0 && y>0) {
        String mensaje;
        mensaje = "2do Cuadrante";
        return (mensaje);
       }
       else if (x<0 && y<0) {
        String mensaje;
        mensaje = "3er Cuadrante";
        return (mensaje);
       }
       else {
       String mensaje;
       mensaje = "4to Cuadrante";
       return (mensaje);
       }
     }
 }

