package Principal;
import Implements.ConexionMySQL;
import Implements.ConexionOracle;
import Implements.ConexionPostgreSQL;
import Implements.ConexionSQLServer;
import Implements.ConexionVacia;
import Interfaces.IConexion;

public class ConexionFabrica {
	
	public IConexion getConexion(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		}
		else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		}
		else if (motor.equalsIgnoreCase("POSTGRES")) {
			return new ConexionPostgreSQL();
		}
		else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}
		return new ConexionVacia();
	}

}
