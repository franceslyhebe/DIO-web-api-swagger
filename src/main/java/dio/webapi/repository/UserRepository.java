package dio.webapi.repository;

import dio.webapi.model.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void save(User usuario){
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário.", id));
        System.out.println(id);
    }

    public List<User> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<User> usuarios = new ArrayList<>();
        usuarios.add(new User("Fran", "12345678"));
        usuarios.add(new User("Enzo", "12345998"));

        return usuarios;
    }

    public User findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("Fran", "12345678");
    }

    public User findByUserName(String username){
        System.out.println(String.format("FIND/username - Recebendo o usernamae: %s para localizar um usuário", username));
        return new User("Fran", "12345678");
    }

}
