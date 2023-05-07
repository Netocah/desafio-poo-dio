package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    //Atributos:
    private int cargaHoraria;
    //Construtor(es):
    public Curso() {
    }
    //Método Sobrescrito:
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    //Getters e Setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    //toString
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
