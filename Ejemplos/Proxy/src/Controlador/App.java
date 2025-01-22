package Controlador;

import Modelo.Cuenta;
import Proxy.CuentaProxy;
import Inter_Impl.CuentaBancoAImpl;
import Inter_Impl.CuentaBancoBImpl;
import Interface.ICuenta;

public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "JuanDi", 100);
		
		ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
		cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 70);
		c = cuentaProxy.retirarDinero(c, 30);
		cuentaProxy.mostrarSaldo(c);

	}

}
