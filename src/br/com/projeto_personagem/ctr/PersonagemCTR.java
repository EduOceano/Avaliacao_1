
package br.com.projeto_personagem.ctr;

import java.sql.ResultSet;
import br.com.projeto_personagem.dto.PersonagemDTO;
import br.com.projeto_personagem.dao.PersonagemDAO;
import br.com.projeto_personagem.dao.ConexaoDAO;

public class PersonagemCTR {
    
    PersonagemDAO personagemDAO = new PersonagemDAO();
    
    public PersonagemCTR() {
    }
    
    public String inserirPersonagem(PersonagemDTO personagemDTO){
        try{
            if(personagemDAO.inserirPersonagem(personagemDTO)){
                return "Personagem criado com sucesso!";
            }
            else{
                return "Erro, Personagem não criado.";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Erro, Personagem não criado.";
        }
    }
    
    public void CloseDB (){
        ConexaoDAO.CloseDB();
    }
    
    public ResultSet consultarPersonagem(PersonagemDTO personagemDTO, int opcao){
        ResultSet rs = null;
        rs = personagemDAO.consultarPersonagem(personagemDTO, opcao);
        return rs;
    }
    
    public String alterarPersonagem(PersonagemDTO personagemDTO){
        try{
            if(personagemDAO.alterarPersonagem(personagemDTO)){
                return "Ficha do personagem atualizada com sucesso!";
            }
            else{
                return "Erro ao atualizar a ficha...";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Erro ao atualizar a ficha...";
        }
    }
    
    public String excluirPersonagem(PersonagemDTO personagemDTO){
        try{
            if(personagemDAO.excluirPersonagem(personagemDTO)){
                return "Personagem deletado!";
            } else {
                return "O personagem não foi excluído.";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "O personagem não foi excluído.";
        }
    }
    
    
}
