package semillero;

import java.sql.*;
import java.util.*;

public class Database {
    
    Connection conn;
    PreparedStatement ps;
    CallableStatement cs;
    ResultSet rs;
    
    String user = "system";
    String password = "admin";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    
    final static String SQL_VERIFY = "SELECT * FROM PERSONA WHERE NOMBRE=? AND APELLIDO=?";
    final static String SQL_VIEW = "SELECT * FROM getAllUser";
    final static String SQL_PERSONA = "SELECT * FROM PERSONA WHERE ID=?";
    final static String SQL_INSERT = "CALL INSERTARPERSONA (NULL, ?, ?, ?, ?)";
    final static String SQL_UPDATE = "CALL ACTUALIZARPERSONA (?, ?, ?, ?, ?)";
    final static String SQL_DELETE = "CALL ELIMINARPERSONA(?)";
    
    public Database() {
        
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            conn = DriverManager.getConnection(url, user, password);
            System.out.println(conn != null ? "Conexion Realizada" : "Conexion Rechazada");
        }
        catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public boolean verifyUsers(String nombre, String apellido) {
        
        try {
            ps = conn.prepareStatement(SQL_VERIFY);
            ps.setNString(1, nombre);
            ps.setNString(2, apellido);
            rs = ps.executeQuery();
            
            return rs.next();
        }
        catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }
    
    public Persona getPersona(String id) {
        
        try {
            ps = conn.prepareStatement(SQL_PERSONA);
            ps.setInt(1, Integer.parseInt(id));
            rs = ps.executeQuery();
            
            Persona p = new Persona();
            if (rs.next()) {
                p.setId(rs.getInt(1));
                p.setNombre(rs.getNString(2));
                p.setApellido(rs.getNString(3));
                p.setTelefono(rs.getInt(4));
                p.setDireccion(rs.getNString(5));
            }
            return p;
        }
        catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
    
    public void insertUser(String nombre, String apellido, String tel, String direccion)    {
        
        try {
            cs = conn.prepareCall(SQL_INSERT);
            cs.setNString(1, nombre);
            cs.setNString(2, apellido);
            cs.setInt(3, Integer.parseInt(tel));
            cs.setNString(4, direccion);
            cs.execute();
        }
        catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                cs.close();
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
    public void updateUser(String nombre, String apellido, String tel, String direccion, String id) {
     
         try {
            cs = conn.prepareCall(SQL_UPDATE);
            cs.setInt(1, Integer.parseInt(id));
            cs.setNString(2, nombre);
            cs.setNString(3, apellido);
            cs.setInt(4, Integer.parseInt(tel));
            cs.setNString(5, direccion); 
            cs.execute();
        }
        catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
             try {
                 cs.close();
             } catch (SQLException e) {
                 System.out.println("Error: " + e.getMessage());
             }
         }
    }
    
    public void deleteUSer(String id) {
        
         try {
            cs = conn.prepareCall(SQL_DELETE);
            cs.setInt(1, Integer.parseInt(id));
            cs.execute();
        }
        catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
             try {
                 cs.close();
             } catch (SQLException e) {
                 System.out.println("Error: " + e.getMessage());
             }
         }
    }
    
    public List<Persona> getAllView() {
        
        try {
            cs = conn.prepareCall(SQL_VIEW);
            rs = cs.executeQuery();
            List<Persona> personas = new ArrayList<>();
            
            while(rs.next()) {
                Persona p = new Persona();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getNString(2));
                p.setApellido(rs.getNString(3));
                p.setTelefono(rs.getInt(4));
                p.setDireccion(rs.getNString(5));
                
                personas.add(p);
            }
            return personas;
        }
        catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                rs.close();
                cs.close();
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return null;
    }
}
