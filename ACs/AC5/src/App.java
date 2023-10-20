public class App {
    public static void main(String[] args) throws Exception {
        Crud crud = new Crud();

        // Adicionando alunos
        crud.adicionarAluno(new Aluno("gabrielzin", "Análise e Desenvolvimento de Sistemas", "1"));
        crud.adicionarAluno(new Aluno("Jorocha", "Análise e Desenvolvimento de Sistemas", "2"));
        crud.adicionarAluno(new Aluno("pedrolidev", "Análise e Desenvolvimento de Sistemas", "3"));

        // Listando todos os alunos
        crud.listarAlunos();

        String matriculaBusca = "2";
        Aluno alunoEncontrado = crud.buscarAluno(matriculaBusca);

        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado: " + alunoEncontrado);
            crud.atualizarCurso(matriculaBusca, "Análise de Desenvolvimento de Sistemas");
            System.out.println("Curso atualizado: " + alunoEncontrado.getCurso());
        } else {
            System.out.println("O estudante não pode ser encontrado.");
        }

        String matriculaRemover = "3";
        crud.removerAluno(matriculaRemover);

        // Listando alunos após a remoção
        crud.listarAlunos();
    }
}
