import java.util.ArrayList;

public class Crud {
    private ArrayList<Aluno> listaAlunos;

    public Crud() {
        this.listaAlunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void removerAluno(String matricula) {
        listaAlunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
    }

    public Aluno buscarAluno(String matricula) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    public void atualizarCurso(String matricula, String novoCurso) {
        Aluno aluno = buscarAluno(matricula);
        if (aluno != null) {
            aluno.setCurso(novoCurso);
        }
    }

    public void listarAlunos() {
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }
}
