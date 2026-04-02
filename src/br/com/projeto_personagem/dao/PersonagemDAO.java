package br.com.projeto_personagem.dao;

import java.sql.*;
import br.com.projeto_personagem.dto.PersonagemDTO;


public class PersonagemDAO {
    
    //Método construtor da Classe
   public PersonagemDAO() {
    }
    
    private ResultSet rs = null;
    private Statement stmt = null;
    
    public boolean inserirPersonagem(PersonagemDTO personagemDTO){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
             
            // Montando o SQL para inserir a ficha de D&D ou do seu RPG
            String comando = "Insert into personagem (nome, classe, raca, nivel, forca, destreza, constituicao, inteligencia, sabedoria, carisma) values ("
            + "'" + personagemDTO.getNome() + "', "    
            + "'" + personagemDTO.getClasse() + "', "
            + "'" + personagemDTO.getRaca() + "', "
            + personagemDTO.getNivel() + ", "
            + personagemDTO.getForca() + ", "
            + personagemDTO.getDestreza() + ", "
            + personagemDTO.getConstituicao() + ", "
            + personagemDTO.getInteligencia() + ", "
            + personagemDTO.getSabedoria() + ", "
            + personagemDTO.getCarisma()  + ")";
            
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }
    
    public ResultSet consultarPersonagem(PersonagemDTO personagemDTO, int opcao){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "";
            
            switch (opcao){
                case 1:
                    comando = "Select p.* "+
                            "from personagem p "+
                            "where p.nome like '"+ personagemDTO.getNome()+ "%' "+
                            "order by p.nome";
                break;
                
                case 2:
                    comando = "Select p.* "+
                            "from personagem p "+
                            "where p.id_personagem = "+ personagemDTO.getId_personagem();
                break;
                
                case 3: 
                    comando = "Select p.id_personagem, p.nome "+
                            "from personagem p";
                break;
            }
            
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
            
        } catch(Exception e){
            System.out.println(e.getMessage());
            return rs;
        }
    }
    
    public boolean alterarPersonagem(PersonagemDTO personagemDTO){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
             
            // Corrigido a sintaxe do UPDATE com os sinais de '=' e espaçamentos
            String comando = "Update personagem Set "
            + "nome = '" + personagemDTO.getNome() + "', "    
            + "classe = '" + personagemDTO.getClasse() + "', "
            + "raca = '" + personagemDTO.getRaca() + "', "
            + "nivel = " + personagemDTO.getNivel() + ", "
            + "forca = " + personagemDTO.getForca() + ", "
            + "destreza = " + personagemDTO.getDestreza() + ", "
            + "constituicao = " + personagemDTO.getConstituicao() + ", "
            + "inteligencia = " + personagemDTO.getInteligencia() + ", "
            + "sabedoria = " + personagemDTO.getSabedoria() + ", "
            + "carisma = " + personagemDTO.getCarisma() + " "
            + "where id_personagem = " + personagemDTO.getId_personagem(); 
            
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }

    public boolean excluirPersonagem(PersonagemDTO personagemDTO){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
             
            String comando = "Delete from personagem where id_personagem = "
                             + personagemDTO.getId_personagem();
            
            stmt.execute(comando);
            ConexaoDAO.con.commit();
            stmt.close();
            
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }
    //Fecha public class PersonagemDAO
}
