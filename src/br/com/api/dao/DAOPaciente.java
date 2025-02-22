package br.com.api.dao;

import br.com.api.model.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOPaciente {

    private Connection conexao;

    // Construtor que recebe a conexão com o banco de dados
    public DAOPaciente(Connection conexao) {
        this.conexao = conexao;
    }

    // Método para inserir um paciente no banco de dados
    public void inserir(Paciente paciente) throws SQLException {
        String sql = "INSERT INTO paciente (nome, cpf, sexo, data_nascimento) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, paciente.getNome());
            stmt.setString(2, paciente.getCpf());
            stmt.setString(3, String.valueOf(paciente.getSexo()));
            stmt.setDate(4, new java.sql.Date(paciente.getDataNascimento().getTime()));
            stmt.executeUpdate();
        }
    }

    // Método para listar todos os pacientes do banco de dados
    public List<Paciente> listarTodos() throws SQLException {
        List<Paciente> pacientes = new ArrayList<>();
        String sql = "SELECT * FROM paciente";
        try (PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Paciente paciente = new Paciente(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getString("sexo").charAt(0),
                        rs.getDate("data_nascimento")
                );
                pacientes.add(paciente);
            }
        }
        return pacientes;
    }

    // Outros métodos como atualizar, excluir, buscar por ID, etc.
}