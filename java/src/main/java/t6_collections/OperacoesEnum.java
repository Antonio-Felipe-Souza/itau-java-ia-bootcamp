package t6_collections;

import java.util.function.BiFunction;

public enum OperacoesEnum {
    SOMA((Integer n1, Integer n2) -> n1 + n2),
    SUBTRACAO((Integer n1, Integer n2) -> n1 - n2);

    private final BiFunction<Integer, Integer, Integer> calcular;

    OperacoesEnum(BiFunction<Integer, Integer, Integer> calcular) {
        this.calcular = calcular;
    }

    public BiFunction<Integer, Integer, Integer> getCalcular() {
        return calcular;
    }
}
