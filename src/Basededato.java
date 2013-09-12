import java.sql.*;


public class Basededato {
private Connection conexion;
static String bd="eclipse";
static String user="root";
static String password="makuko";
static String server="jdbc:mysql://localhost/"+bd;

/** Creates a new instance of BasedeDatos */
public Basededato() {
}

public void establecerConexion(){
try{
Class.forName("com.mysql.jdbc.Driver");
conexion = DriverManager.getConnection(server,user,password);
}
catch(Exception e){
System.out.println("Imposible realizar conexion con la BD");
e.printStackTrace();
}
}

public void consulta(){
try{
Statement s = conexion.createStatement();
ResultSet rs = s.executeQuery("select * from personas where nombre = 'claudio'");
while(rs.next()){
System.out.println(rs.getString(1));
}
}catch(SQLException e){
	e.printStackT
}
}
public void agregar(){
	try{
	Statement s1 = conexion.createStatement();
	

	
	
	
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	
}





public Connection getConexion(){
return conexion;
}

public void cerrar(ResultSet rs){
if(rs !=null){
try{
rs.close();
}
catch(Exception e){
System.out.print("No es posible cerrar la Conexion");
}
}
}

public void cerrar(java.sql.Statement stmt){
if(stmt !=null){
try{
stmt.close();
}
catch(Exception e){}
}
}

public void destruir(){

if(conexion !=null){

try{
conexion.close();
}
catch(Exception e){}
}
}


public static void main(String[] args){
	
	Basededato b = new Basededato();
	b.establecerConexion();
	System.out.println(b.getConexion());
	//b.consulta();
	
	
	
}







}
