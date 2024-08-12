import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Jogadores {

    public void createTable() {
        try (Statement statement = BancoDeDados.connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS Jogadores //Insira seu código aqui");

            //Insira seu código aqui
            try (Statement statement = BancoDeDados.connection.createStatement()) {
                statement.execute(createTableSQL);
                System.out.println("Tabela Jogadores criada com sucesso.");
            } catch (SQLException e) {
                System.out.println("Erro ao criar tabela: " + e.getMessage());

            } catch (SQLException e) {
                System.out.println("Erro ao criar tabela: " + e.getMessage());

            }
    }

    public void inserirJogador(List<String[]> lista) {
        try (PreparedStatement insertStatement = BancoDeDados.connection.prepareStatement("INSERT INTO Jogadores //Insira seu código aqui")) {

            //Insira seu código aqui
                for (String[] jogador : lista) {
                    insertStatement.setString(1, jogador[0]); // nome
                    insertStatement.setInt(2, Integer.parseInt(jogador[1])); // idade
                    insertStatement.setString(3, jogador[2]); // posição
                    insertStatement.executeUpdate();
                }
                System.out.println("Jogadores inseridos com sucesso.");
            } catch (SQLException e) {
                System.out.println("Erro ao inserir jogador: " + e.getMessage());
            }
        }

        } catch (SQLException e) {
            System.out.println("Erro ao inserir jogador: " + e.getMessage());
        }
    }

    public void lerJogador(String nomeQuery) {
        try (PreparedStatement selectStatement = BancoDeDados.connection.prepareStatement("SELECT * FROM Jogadores //Insira seu código aqui ")) {

            //Insira seu código aqui

        } catch (SQLException e) {
            System.out.println("Erro ao consultar jogadores: " + e.getMessage());
        }
    }

    public void deleteJogador(String nome) {
        try (PreparedStatement deleteStatement = BancoDeDados.connection.prepareStatement("DELETE FROM Jogadores //Insira seu código aqui")) {

            //Insira seu código aqui
            
        } catch (SQLException e) {
            System.out.println("Erro ao deletar jogadores: " + e.getMessage());
        }
    }
}
