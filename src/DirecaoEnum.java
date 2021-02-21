public enum DirecaoEnum {
    N, W, S, E;

    public DirecaoEnum getNovaDirecaoEsquerda() {
        switch (this) {
            case N:
                return DirecaoEnum.W;
            case E:
                return DirecaoEnum.N;
            case S:
                return DirecaoEnum.E;
            default:
                return DirecaoEnum.S;
        }
    }

    public DirecaoEnum getNovaDirecaoDireita() {
        switch (this) {
            case N:
                return DirecaoEnum.E;
            case E:
                return DirecaoEnum.S;
            case S:
                return DirecaoEnum.W;
            default:
                return DirecaoEnum.N;
        }
    }
}


