

public class SegundoExemploPolimorfismo
{
    public static void main(String args[])
    {
        /*Usuario usuario = new Usuario(  Teclado.leInt("Informe a matricula do usuário: "),
                                        Teclado.leString("Informe o nome do usuário: "),
                                        Teclado.leString("Informe o login do usuário: "),
                                        Teclado.leString("Informe a senha do usuário: ")
                                      );*/
        Professor professor = new Professor(    Teclado.leInt("Informe a matricula do professor: "),
                                                Teclado.leString("Informe o nome do professor: "),
                                                Teclado.leString("Informe o login do professor: "),
                                                Teclado.leString("Informe a senha do professor: ")
                                            );
        professor.setAreaAtuacao("Informática");// atribuindo atributo através do método de conficuração
        Aluno aluno = new Aluno(  Teclado.leInt("Informe a matricula do aluno: "),
                                        Teclado.leString("Informe o nome do aluno: "),
                                        Teclado.leString("Informe o login do aluno: "),
                                        Teclado.leString("Informe a senha do aluno: ")
                                ); 
        //usuario.exibeDados();
        professor.exibeDados();
        aluno.exibeDados();
    }
}
