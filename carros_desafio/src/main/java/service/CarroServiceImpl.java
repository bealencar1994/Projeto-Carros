package service;

import model.Carro;


public class CarroServiceImpl implements CarroService {
    @Override
    public void acelerar(Carro carro, int velocidadeAMais) {
        if(carro.isLigado()) {
            if (carro.getVelocidadeAtual() == carro.getVelocidadeMaxima()) {
                carro.setVelocidadeAtual(carro.getVelocidadeMaxima());
            } else {
                carro.setVelocidadeAtual(carro.getVelocidadeAtual() + velocidadeAMais);
            }
        } else {
            carro.setVelocidadeAtual(0);
        }
    }

    @Override
    public void frear(Carro carro, int velocidadeAMenos) {
        if ((carro.getVelocidadeAtual() - velocidadeAMenos) <= 0) {
            carro.setVelocidadeAtual(0);
        } else {
            carro.setVelocidadeAtual(carro.getVelocidadeAtual() - velocidadeAMenos);
        }
    }

    @Override
    public void ligar(Carro carro) {
        carro.setLigado(true);
    }

    @Override
    public void desligar(Carro carro) {
        if (carro.getVelocidadeAtual() == 0) {
            carro.setLigado(false);
        } else {
            carro.setLigado(true);
        }
    }

    @Override
    public String estadoAtual(Carro carro) {
        return carro.toString();
    }
}
