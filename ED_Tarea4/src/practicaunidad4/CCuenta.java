/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaunidad4;


public class CCuenta {

   private String nombre;
   private String cuenta;
   private double saldo;
   private double tipoInterés;
   
	public String getNombre() {
		return nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
    
    public CCuenta ()
    {
    }
    
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
   
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    
    

    
     public double estado ()
    {
        return saldo;
    }

    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }



    
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }

    public void operativa_cuenta(CCuenta miCuenta,float ingresar, int opcion,float cantidad){
        if(opcion==2){
            try 
            {
                miCuenta.retirar(cantidad);
            } catch (Exception e)
            {
                System.out.print("Fallo al retirar");
            }
        }else if(opcion==1){
            try
            {
                System.out.println("Ingreso en cuenta");
                miCuenta.ingresar(cantidad);
            } catch (Exception e)
            {
                System.out.print("Fallo al ingresar");
            }
        }
    }
    
}
