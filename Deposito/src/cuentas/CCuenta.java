package cuentas;
public class CCuenta {
	
	/**NO HE REALIZADO EL MÓDULO DE PROGRAMACIÓN DURANTE ESTE CURSO POR FALTA DE PLAZAS, POR LO QUE NO ENTIENDO MUY BIEN
	 * QUE ES LO QUE ESTÁN HACIENDO TODAS ESTAS CLASES, YA QUE AÚN NO HE TOCADO NADA DE JAVA Y NO ME VEO CAPAZ DE PODER AÑADIR
	 * COMENTARIOS SOBRE LO QUE ESTÁ HACIENDO TODO ESTO, SIN EMBARGO, SÍ HE APRENDIDO A HACER COMENTARIOS.
	 * 
	 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
