package ValidarEmail;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class ValidacionDeEmail {
        String validacion = "[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}+(?:\\.[a-zA-Z0-9-]+)*"; 
        String pass = "[a-zA-Z0-9-#$%&._]{6,}";
        
        public void Validar(String email, String password)
        {
            //System.out.println(Pattern.matches(validacion, email));
            if(Pattern.matches(validacion, email) && Pattern.matches(pass, password)){
                JOptionPane.showMessageDialog(null, "El email " + email + " y la contraseña son válidas");
            }else{
                JOptionPane.showMessageDialog(null, "Email o Contraseña no Válidos");
            }
        }
        
}
