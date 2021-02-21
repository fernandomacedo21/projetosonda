public class Sonda {

    private int coordenadaX;

    private int coordenadaY;

    private DirecaoEnum direcao;

    private Sonda(int coordenadaX, int coordenadaY, DirecaoEnum direcao) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.direcao = direcao;
    }

    public static Sonda createNewSonda(String coordenadaX, String coordenadaY, String direcao){
        return new Sonda(Integer.valueOf(coordenadaX),
                Integer.valueOf(coordenadaY),DirecaoEnum.valueOf(direcao));
    }

    public void executaComando(String comando) {
        if (comando.equals(ComandosEnum.L.toString())){
            this.direcao = direcao.getNovaDirecaoEsquerda();
        }else if(comando.equals(ComandosEnum.R.toString())){
            this.direcao = direcao.getNovaDirecaoDireita();
        }else if(comando.equals(ComandosEnum.M.toString())){
            avancarSonda();
        }else {
            throw new ComandoInvalidoException();
        }
    }

    private void avancarSonda() {
        if(direcao.equals(DirecaoEnum.N)){
            coordenadaY++;
        }else if(direcao.equals(DirecaoEnum.E)){
            coordenadaX++;
        }else if(direcao.equals(DirecaoEnum.W)){
            coordenadaX--;
        }else if(direcao.equals(DirecaoEnum.S)){
            coordenadaY--;
        }
    }
    public String imprimirCoordenadas() {
        return coordenadaX+" "+coordenadaY+" "+direcao;
    }
}


