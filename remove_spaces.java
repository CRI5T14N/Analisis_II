package quitar_espacios;

import javax.swing.JOptionPane;


public class remove_spaces {
    String newCadena = "";
    
    public String remove(String cadena)
    {
        for(int i = 0; i < cadena.length(); i++)
        {
            if(cadena.charAt(i) != ' ' && cadena.charAt(i) != '\n')
            {
                newCadena = newCadena+cadena.charAt(i);
            }
        }
        //JOptionPane.showMessageDialog(null, newCadena);
        return newCadena;
    }
    
    
}
