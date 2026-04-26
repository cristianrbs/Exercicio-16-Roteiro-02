
package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Voo {
    private String numVoo;
    private String destino;
    private int capacidadeMaxima;
    private List<Passageiro> passageiros;
    private List<String> escalas;
    private String estadoDoVoo;
    
    //metodo construtor sem parametro
    public Voo(){
        this.numVoo = "";
        this.capacidadeMaxima = 0;
        this.passageiros = new ArrayList<>();
        this.escalas = new ArrayList<>();
        this.estadoDoVoo = "Aguardando decolagem";
    }
    
    //metodo construtor com parametro
    public Voo(String numVoo, String destino, int capacidadeMaxima, List<Passageiro> passageiros, List<String> escalas, String estadoDoVoo) {
        this.numVoo = numVoo;
        this.destino = destino;
        this.capacidadeMaxima = capacidadeMaxima;
        this.passageiros = passageiros;
        this.escalas = escalas;
        this.estadoDoVoo = estadoDoVoo;
    }
    
    //metodo adicionar passageiros
    public void adicionarPassageiros(Passageiro passageiroNovo){
        if(passageiros.contains(passageiroNovo)){
            System.out.println("Passageiro ja existe");
        }
        else{
            passageiros.add(passageiroNovo);
        }
    }
    
    //metodo remover passageiros
    public void removerPassageiros(Passageiro CPF){
        if(!passageiros.contains(CPF)){
            System.out.println("Passageiro nao existe");
        }
        else{
            passageiros.remove(CPF);
        }
    }
    
    //metodo adicionar escalas
    public void adicionarEscalas(String escalaNova){
        if(escalas.contains(escalaNova)){
            System.out.println("Escala ja existe");
        }
        else{
            escalas.add(escalaNova);
        }
    }
    
    //metodo remover escalas
    public void removerEscalas(String escala){
        if(!escalas.contains(escala)){
            System.out.println("Escala nao existe");
        }
        else{
            escalas.remove(escala);
        }
    }
    
    //metodo alterar o estado do voo
    public void alterarEstado(String novoEstado){
        if (novoEstado.equalsIgnoreCase("Aguardando decolagem") || novoEstado.equalsIgnoreCase("Voando") ||novoEstado.equalsIgnoreCase("Concluído")){
                this.estadoDoVoo = novoEstado;
                System.out.println("Estado do voo alterado para: " + novoEstado);
        } 
        else {
            System.out.println("Estado inválido. Use: 'Aguardando decolagem', 'Voando' ou 'Concluído'.");
        }
    }
    
    //metodo verificar se o voo está abaixo da capacidade mínima.
    public void verificarCapacidade() {
        if (passageiros.size() < 5) {
            System.out.println("Voo abaixo da capacidade minima.");
        } 
        else {
            System.out.println("Voo acima da capacidade minima.");
        }
    }
    
    //metodo toString
    @Override
    public String toString() {
        return "Voo{" + "numVoo=" + numVoo 
                + ", destino=" + destino 
                + ", capacidadeMaxima=" + capacidadeMaxima 
                + ", passageiros=" + passageiros 
                + ", escalas=" + escalas 
                + ", estadoDoVoo=" + estadoDoVoo 
                + '}';
    }
    
    //getters e setters
    public String getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(String numVoo) {
        this.numVoo = numVoo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public List<String> getEscalas() {
        return escalas;
    }

    public void setEscalas(List<String> escalas) {
        this.escalas = escalas;
    }

    public String getEstadoDoVoo() {
        return estadoDoVoo;
    }

    public void setEstadoDoVoo(String estadoDoVoo) {
        this.estadoDoVoo = estadoDoVoo;
    }
    
    //equal e hashcode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.numVoo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voo other = (Voo) obj;
        return Objects.equals(this.numVoo, other.numVoo);
    }
}
