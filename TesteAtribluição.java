import javax.swing.JOptionPane;
public class TesteAtribluição
{
   public static void main (String [] args)
   {
      String nomeP = JOptionPane.showInputDialog("Digite o nome do professor");
      int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do professor"));
      String nomeD = JOptionPane.showInputDialog("Digite o nome da disciplina");
      boolean pratica = Boolean.parseBoolean(JOptionPane.showInputDialog("A disciplina é pratica ?true/false"));
      
      Professor professor = new Professor (nomeP, idade);
      Disciplina disciplina = new Disciplina (nomeD, pratica);
      Atribuicao a = new Atribuicao (professor, disciplina);
      
      JOptionPane.showMessageDialog(null, a.getDados());
      
   }
      
}