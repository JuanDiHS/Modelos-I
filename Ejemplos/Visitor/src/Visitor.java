//Interfaz visitante
public interface Visitor {
	void visit(Tablet tableta);
	void visit(Computador computador);
	void visit(Celular celular);

}
