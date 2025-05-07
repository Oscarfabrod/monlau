/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.Categoria;
import util.ConnectionPool;
import java.sql.*;
import java.util.*;
/**
 *
 * @author oscarfabrod
 */
public class CategoriaDAO {
    public void insertar(Categoria cat) throws SQLException {
        String sql = "INSERT INTO categoria(nombre) VALUES(?)";
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cat.getNombre());
            stmt.executeUpdate();
        }
    }
    public List<Categoria> listar() throws SQLException {
        List<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT * FROM categoria";
        try (Connection conn = ConnectionPool.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Categoria c = new Categoria();
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                categorias.add(c);
            }
        }
        return categorias;
}

    public Categoria obtenerPorId(int idCat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
