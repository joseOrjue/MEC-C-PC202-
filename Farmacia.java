import java.util.ArrayList;

class Farmacia {
    static ArrayList<String> listNomb;
     static ArrayList<Farmacia> listFar;
     String nombre;
     String direccion;
     String telefeno;
     ArrayList<Cita> citas;
     
   
     
     public static void gestionFarmacias(){
         if(listNomb == null)
            listNomb = new ArrayList<String>();
         String nombreFar = Lectura.nextString("\n\nNombre farmacia: ");
         if(listNomb.contains(nombreFar.toLowerCase().replaceAll(" ", ""))) {
             System.out.println("Farmacia ya existe!!");
            crud(nombreFar);
         }else{
             System.out.println("Farmacia nueva!!");
             listNomb.add(nombreFar.toLowerCase().replaceAll(" ", ""));
         }
         
     }
     
       //METODO CRUD 
     public class FarmaciaDAO {
         public void actualizarFarmacia (Farmacia farmacia){
         }
         // codigo para actualizar el objeto 
         }
     
     public class FarmaciaDAO {
    private Connection getConnection() throws SQLException {
        // Código para obtener una conexión JDBC
    }

    private void close(Connection conn) throws SQLException {
        // Código para cerrar la conexión JDBC
    }

    private void close(Statement stmt) throws SQLException {
        // Código para cerrar la consulta JDBC
    }
     
     public void actualizarFarmacia(Farmacia farmacia) throws SQLException {
         try {
            conn = getConnection();
            String sql = "UPDATE usuarios SET nombre=?, correo_electronico=?, contrasena=? WHERE id=?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getnombreFar());
           
            stmt.executeUpdate();
        } finally {
            close(stmt);
            close(conn);
        }
    }
}
         
     
     
     public static void crud(String drogueria){
          FarmaciaDAO farmaciaDAO = new FarmaciaDAO();
    Farmacia farmacia  = new Farmacia();
         int sel = Lectura.nextInt("\n1. Colsultar 2.Modificar 3.Borrar\n"
                    + "==>");
                    switch(sel){
                        case 1:
                            Farmacia.setId(1);
                            Farmacia.setnombre(listNomb);

                            FarmaciaDAO.actualizarFarmacia(farmacia);
                            break;
                        case 2:break;
                        case 3:break;
                       
                    }
         
     }
}

  
    