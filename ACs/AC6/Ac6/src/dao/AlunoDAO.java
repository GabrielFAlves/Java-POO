package dao;

import entidades.Aluno;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    private String arquivo;
    private List<Aluno> alunos;

    public AlunoDAO(String arquivo) {
        this.arquivo = arquivo;
        this.alunos = new ArrayList<>();
        carregarAlunos();
    }

    private void carregarAlunos() {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                String nome = dados[0].trim();
                String curso = dados[1].trim();
                String matricula = dados[2].trim();
                Aluno aluno = new Aluno(nome, curso, matricula);
                alunos.add(aluno);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void salvarAlunos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Aluno aluno : alunos) {
                String linha = aluno.getNome() + ", " + aluno.getCurso() + ", " + aluno.getMatricula();
                bw.write(linha);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        salvarAlunos();
    }

    public void removerAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                alunos.remove(aluno);
                salvarAlunos();
                return;
            }
        }
    }

    public void atualizarCurso(String matricula, String novoCurso) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                aluno.setCurso(novoCurso);
                salvarAlunos();
                return;
            }
        }
    }

    public List<Aluno> listarAlunos() {
        return alunos;
    }
}
