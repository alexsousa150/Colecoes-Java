package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Palavras {
    private String palavras;

    public Palavras(String palavras) {
        this.palavras = palavras;
    }

    public String getPalavras() {
        return palavras;
    }

    @Override
    public String toString() {
        return "Palavras{" +
                "palavras='" + palavras + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Palavras palavras1)) return false;
        return Objects.equals(getPalavras(), palavras1.getPalavras());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalavras());
    }
}
